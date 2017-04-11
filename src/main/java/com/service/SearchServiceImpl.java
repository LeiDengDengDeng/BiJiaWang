package com.service;

import com.model.GoodEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by liying on 2017/4/11.
 */
@Service("searchService")
@Transactional
public class SearchServiceImpl implements SearchService{
    @Override
    public List<GoodEntity> analyse(String[] keywords) {
        return null;
    }
}
