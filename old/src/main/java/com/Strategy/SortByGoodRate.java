package com.Strategy;

import java.util.List;

/**
 * Created by liying on 2017/4/11.
 */
<<<<<<< HEAD:old/src/main/java/com/Strategy/SortByGoodRate.java
public class SortByGoodRate<GoodEntity> implements SortStrategy<GoodEntity> {

    @Override
    public List<GoodEntity> sort(List<GoodEntity> list) {
=======
public class SortByGoodRate<GoodsEntity> implements SortStrategy<GoodsEntity> {

    @Override
    public List<GoodsEntity> sort(List<GoodsEntity> list) {
>>>>>>> origin/master:src/main/java/com/Strategy/SortByGoodRate.java
        list.sort(new GoodRateComparator());
        return list;
    }
}
