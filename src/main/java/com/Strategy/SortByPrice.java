package com.Strategy;

import java.util.List;

/**
 * Created by liying on 2017/4/11.
 */
public class SortByPrice<GoodsEntity> implements SortStrategy<GoodsEntity> {

    @Override
    public List<GoodsEntity> sort(List<GoodsEntity> list) {
        list.sort(new PriceComparator());
        return list;
    }
}
