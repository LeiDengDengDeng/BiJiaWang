package com.Strategy;

import java.util.List;

/**
 * Created by liying on 2017/4/11.
 */
<<<<<<< HEAD:old/src/main/java/com/Strategy/SortByPrice.java
public class SortByPrice<GoodEntity> implements SortStrategy<GoodEntity> {

    @Override
    public List<GoodEntity> sort(List<GoodEntity> list) {
=======
public class SortByPrice<GoodsEntity> implements SortStrategy<GoodsEntity> {

    @Override
    public List<GoodsEntity> sort(List<GoodsEntity> list) {
>>>>>>> origin/master:src/main/java/com/Strategy/SortByPrice.java
        list.sort(new PriceComparator());
        return list;
    }
}
