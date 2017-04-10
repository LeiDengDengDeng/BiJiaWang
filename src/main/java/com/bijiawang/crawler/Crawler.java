package com.bijiawang.crawler;

/**
 * Created by starrylemon on 2017/4/10.
 */
public class Crawler {

    private String homePage;
    private JDspider js;

    public Crawler(){
        homePage="http://www.jd.com/";
        js=new JDspider();
        js.parseHomePage(homePage);
        js.begin();
    }

}
