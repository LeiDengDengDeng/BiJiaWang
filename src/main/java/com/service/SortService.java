package com.service;

import com.Strategy.SortStrategy;
import com.model.GoodEntity;

import java.util.List;

/**
 * Created by liying on 2017/4/11.
 */
public interface SortService {

     List<GoodEntity> sort(List<GoodEntity> list, SortStrategy sortStrategy);
}
