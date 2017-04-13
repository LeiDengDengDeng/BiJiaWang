package com.Strategy;

import java.util.Collections;
import java.util.List;

/**
 * Created by liying on 2017/4/11.
 */
<<<<<<< HEAD:old/src/main/java/com/Strategy/SortByGoodRateDesc.java
public class SortByGoodRateDesc<GoodEntity> implements SortStrategy<GoodEntity> {

    @Override
    public List<GoodEntity> sort(List<GoodEntity> list) {
=======
public class SortByGoodRateDesc<GoodsEntity> implements SortStrategy<GoodsEntity> {

    @Override
    public List<GoodsEntity> sort(List<GoodsEntity> list) {
>>>>>>> origin/master:src/main/java/com/Strategy/SortByGoodRateDesc.java
        list.sort(new GoodRateComparator());
        Collections.reverse(list);
        return list;
    }
}
