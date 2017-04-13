package com.Strategy;

import java.util.Collections;
import java.util.List;

/**
 * Created by liying on 2017/4/11.
 */
public class SortByPriceDesc<Goods> implements SortStrategy<Goods> {

    @Override
    public List<Goods> sort(List<Goods> list) {
        list.sort(new PriceComparator());
        Collections.reverse(list);
        return list;
    }
}
