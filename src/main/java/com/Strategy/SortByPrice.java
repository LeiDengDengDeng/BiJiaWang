package com.Strategy;

import java.util.List;

/**
 * Created by liying on 2017/4/11.
 */
public class SortByPrice<Goods> implements SortStrategy<Goods> {

    @Override
    public List<Goods> sort(List<Goods> list) {
        list.sort(new PriceComparator());
        return list;
    }
}
