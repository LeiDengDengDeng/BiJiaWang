package com.bijiawang.crawler;

import com.model.GoodEntity;
import com.repository.GoodRepository;
import com.util.MyDate;
import com.util.ReadConfigTxt;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class JDspider {

    private Set<String> allUrlset;
    private ArrayList<String> notVisited;
    private HashMap<String,Integer> depths;
    private int maxDepth;
    private int maxthread;
    private int waitNum;
    private ReadConfigTxt readConfigTxt;

    public static final Object signal=new Object();

    @Autowired
    public GoodRepository goodRepository;

    public JDspider() {
        allUrlset=new HashSet<>();
        notVisited=new ArrayList<>();
        depths=new HashMap<>();
        readConfigTxt=new ReadConfigTxt();

        maxDepth=this.getMaxDepthFromConfig("src/main/java/config/depth.txt");
        maxthread=this.getMaxthreadFromConfig("src/main/java/config/threadNum.txt");
        waitNum=0;

        System.out.println("kobe :"+maxDepth+"  "+maxthread);
    }

    //读取配置文件里的爬取深度
    private int getMaxDepthFromConfig(String path){
        int result;
        String line=readConfigTxt.getTxtContent(path);
        try {
            result=Integer.parseInt(line);
            if(result<3 || result>10 ){
                result=3;
            }
        }catch (Exception e){
            result=3;
            e.printStackTrace();
        }
        return result;
    }

    //读取配置文件里的线程数
    private int getMaxthreadFromConfig(String path){
        int result;
        String line=readConfigTxt.getTxtContent(path);
        try {
            result=Integer.parseInt(line);
            if(result<10 || result>50){
                result=10;
            }
        }catch (Exception e){
            result=10;
            e.printStackTrace();
        }
        return result;
    }

    public void begin(){
        for (int i = 0; i < maxthread; i++) {
            new Thread(new Runnable() {
                public void run() {
                    while (true){
                        String url=getUrl();
                        if (url!=null){
                            crawler(url);
                        }
                        else {
                            synchronized (signal){
                                try {
                                    waitNum++;
                                    System.out.println("当前有"+waitNum+"个线程在等待");
                                    signal.wait();
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }

                            }
                        }
                    }
                }
            }).start();
        }
    }

    private void crawler(String url) {
        try {
            Document doc= Jsoup.connect(url).get();
            int depth=depths.get(url);
//            System.out.println("开始爬取网页："+url);
//            System.out.println("深度："+depth);
//            System.out.println("执行线程："+Thread.currentThread().getName());
//            System.out.println("------------------------------");
            if (depth<maxDepth){
                parseContent(doc,depth+1,url);
            }
        } catch (IOException e) {
            System.out.println("发现一个无效的链接："+url+"<--------------------------------");
            e.printStackTrace();
        }

    }

    private void parseContent(Document doc, int depth,String url) {
        //判断是否是商品页，是则构建bean，不是
        Pattern pattern=Pattern.compile(".*?item.jd.com/(.+?).html");
        Matcher matcher=pattern.matcher(url);
        String number;

        Date today= MyDate.getTodayDateSQL();

        if (matcher.find()&&(number=matcher.group(1))!=null){
//            System.out.println("开始解析编号为"+number+"的商品");
            JDBean jc=new JDBean(doc,url,number);

            GoodEntity goodEntity=new GoodEntity();
            goodEntity.setName(jc.getName());
            goodEntity.setUrl(jc.getUrl());
            goodEntity.setPictureSrc(jc.getPictureSrc());
            goodEntity.setDetail(jc.getDetail());
            goodEntity.setPrice(jc.getPrice()+"");
            goodEntity.setCommentCount(jc.getCommentCount());
            goodEntity.setGoodRate(jc.getGoodRate());
            goodEntity.setDate(today);
            goodRepository.saveAndFlush(goodEntity);


//            if (DBcontrol.insertToDB(jc)){
//                System.out.println("编号为："+number+"的商品信息已存入数据库");
//            }
//            else {
//                System.out.println(number+"存入数据库失败");
//            }

            System.out.println(jc);
        }

        //找到content中所有商品页，并加入set，
        Elements elements=doc.select("a[href~=item.jd.com/.+?]");
        for (Element link:elements){
            String str=link.attr("abs:href");
            if (!allUrlset.contains(str)){
                addUrl(str,depth);
            }
        }



    }


    public synchronized String getUrl() {
        if (notVisited.isEmpty()){
            return null;
        }
        String tempUrl=notVisited.get(0);
        notVisited.remove(0);
        return tempUrl;
    }

    public synchronized void  addUrl(String url,int depth) {
        notVisited.add(url);
        allUrlset.add(url);
        depths.put(url,depth);
    }

    public void parseHomePage(String homePage) {
        try {
            Document doc=Jsoup.connect(homePage).get();
            Elements channels=doc.select("a.cate_menu_lk");
            for (Element channel:channels){
                String link=channel.attr("abs:href");
                if (!allUrlset.contains(link)){
//                    System.out.println("加入新频道："+link);
                    addUrl(link,1);
                    if (waitNum>0){
                        synchronized (signal){
                            waitNum--;
                            signal.notify();
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
