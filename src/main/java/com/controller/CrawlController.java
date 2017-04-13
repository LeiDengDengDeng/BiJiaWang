package com.controller;


/*
这是测试爬虫用，待删除
*/

import com.bijiawang.crawler.Crawler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CrawlController {

    @RequestMapping(value = "/crawler")
    public void crawler(){
        Crawler crawler=new Crawler();
        crawler.start();
    }

}
