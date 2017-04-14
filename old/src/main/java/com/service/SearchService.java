package com.service;

import com.model.GoodEntity;

import java.util.List;

/**
 * Created by liying on 2017/4/11.
 */
public interface SearchService {

     List<GoodEntity> analyse(List<String> keywords);
}
