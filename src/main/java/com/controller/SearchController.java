package com.controller;

import com.model.GoodEntity;
import com.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by liying on 2017/4/11.
 */
@Controller
@RequestMapping("/search")
public class SearchController {

    @Autowired
    private SearchService searchService;

    @RequestMapping
    public Iterator<GoodEntity> searchGoods(String keyword){
        //todo 从同义词列表获取同义词
        String[] keywords=null;

        //将列表中的所有词交给analyse分析
        List<GoodEntity> goodEntities= searchService.analyse(keywords);


        return goodEntities.iterator();
    }

}
