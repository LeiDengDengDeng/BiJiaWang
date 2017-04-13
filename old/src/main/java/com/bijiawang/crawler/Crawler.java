package com.bijiawang.crawler;


import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Crawler {

    private String homePage;
    private JDspider js;

//    @Scheduled(cron = "0 0 0 * * ?")
    public void start(){
        homePage="http://www.jd.com/";
        js=new JDspider();
        js.parseHomePage(homePage);
        js.begin();
    }

}
