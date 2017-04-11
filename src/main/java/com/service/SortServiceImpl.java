package com.service;

import com.Strategy.SortStrategy;
import com.model.GoodEntity;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by liying on 2017/4/11.
 */
@Service("sortService")
public class SortServiceImpl implements SortService {
    @Override
    public List<GoodEntity> sort(List<GoodEntity> list, SortStrategy sortStrategy) {
        List<GoodEntity> list1=sortStrategy.sort(list);
        return list1;
    }
}
