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
    public List<GoodEntity> analyse(List<String> keywords) {

        List<GoodEntity> goodEntities = new ArrayList<>();
        //匹配关键词
        for (String key:keywords){
            //获得repository的中搜索的列表
            goodEntities.addAll(goodRepository.searchGood(key));
            goodEntities.addAll(goodRepository.searchGoodByDetail(key));

        }
            return goodEntities;

    }

}
