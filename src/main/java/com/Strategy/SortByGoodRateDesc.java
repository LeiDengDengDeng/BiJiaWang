package com.Strategy;

import java.util.Collections;
import java.util.List;

/**
 * Created by liying on 2017/4/11.
 */
public class SortByGoodRateDesc<GoodsEntity> implements SortStrategy<GoodsEntity> {

    @Override
    public List<GoodsEntity> sort(List<GoodsEntity> list) {
        list.sort(new GoodRateComparator());
        Collections.reverse(list);
        return list;
    }
}
