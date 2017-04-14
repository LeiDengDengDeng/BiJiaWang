package bijiawang.crawler;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * Created by lenovo on 2017/3/25.
 */
public class JDBean {
    String name="";
    String url="";
    String pictureSrc="";
    String detail="";
    //以下三项是动态加载的信息，无法从页面直接获取
    double price=0;
    int commentCount=0;
    double goodRate=0;

    public JDBean(Document doc, String url, String number) {
        this.url = url;

        //jd商品页分两种，选出图片地址，商品名，商品详情的选择器也不同

        //选出图片地址
        Element img = doc.select("img[data-origin]").first();
        if (img!=null)
            this.pictureSrc = img.attr("abs:data-origin");
        else  {
            img = doc.select("img[src]").first();
            this.pictureSrc=img.attr("abs:src");
        }
        if(pictureSrc==null){
            pictureSrc="";
        }

        //选出商品名
        Element name = doc.select("div.sku-name").first();
        if (name!=null){
            this.name = name.text();

        }else {
            name=doc.select("div#name h1").first();
            this.name=name.text();
        }
        if(this.name==null){
            this.name="";
        }


        //选出商品详情
        Elements details = doc.select("ul.parameter2 li");

        if (details!=null) {
            this.detail=details.text();
        }else {
            details = doc.select("ul#parameter2 li");
            this.detail=details.text();
        }
        if(this.detail==null){
            this.detail="";
        }

        //获取价格
        String priceUrl = "http://p.3.cn/prices/mgets?skuIds=J_" + number + ",J_&type=1";
        setPrice(priceUrl);

        //获取评论信息
        String commentUrl = "http://club.jd.com/productpage/p-" + number + "-s-0-t-3-p-0.html";
        setComment(commentUrl);
        System.out.println();

    }

    private void setComment(String commentUrl) {
        JSONObject jsonObject = null;
        try {
            Connection.Response response = Jsoup.connect(commentUrl).ignoreContentType(true).execute();
            jsonObject = JSON.parseObject(response.body()).getJSONObject("productCommentSummary");
            this.commentCount = jsonObject.getInteger("commentCount");
            this.goodRate = jsonObject.getDouble("goodRate");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void setPrice(String priceUrl) {
        JSONArray jsonArray = null;
        try {
            Connection.Response response = Jsoup.connect(priceUrl).ignoreContentType(true).execute();
            jsonArray = JSON.parseArray(response.body());
            this.price = jsonArray.getJSONObject(0).getDouble("p");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public String getUrl() {
        return url;
    }

    public String getPictureSrc() {
        return pictureSrc;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDetail() {
        return detail;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public double getGoodRate() {
        return goodRate;
    }

    @Override
    public String toString() {

        return  "name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", pictureSrc='" + pictureSrc + '\'' +
                ", detail='" + detail + '\'' +
                ", price=" + price +
                ", commentCount=" + commentCount +
                ", goodRate=" + goodRate +
                '}';
    }
}
