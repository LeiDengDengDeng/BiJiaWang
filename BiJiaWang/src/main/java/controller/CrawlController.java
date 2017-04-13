package controller;


/*
这是测试爬虫用，待删除
*/

import bijiawang.crawler.Crawler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CrawlController {

    @Autowired
    Crawler crawler;

    @RequestMapping(value = "/crawler")
    public void crawler(){
        crawler.start();
    }

}
