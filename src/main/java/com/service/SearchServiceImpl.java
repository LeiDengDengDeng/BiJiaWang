package com.service;

import com.model.GoodEntity;
import com.repository.GoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liying on 2017/4/11.
 */
@Service("searchService")
@Transactional
public class SearchServiceImpl implements SearchService{

    @Autowired
    private GoodRepository goodRepository;


    @Override
    public List<GoodEntity> analyse(String[] keywords) {

        List<GoodEntity> goodEntities = new ArrayList<>();
        //匹配关键词
        for (String key:keywords){
            //todo 获得repository的中搜索的列表
            goodEntities.addAll(goodRepository.searchGood(key));
            goodEntities.addAll(goodRepository.searchGoodByDetail(key));

        }
            return goodEntities;

    }
    public static void main(String[] args){
        SearchServiceImpl searchService=new SearchServiceImpl();
        String[] s={"iphone"};
        searchService.analyse(s);
    }
}
