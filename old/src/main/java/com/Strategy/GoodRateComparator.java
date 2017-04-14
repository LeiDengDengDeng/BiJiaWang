package com.Strategy;

import com.model.GoodEntity;

import java.util.Comparator;

/**
 * Created by liying on 2017/4/13.
 */
public class GoodRateComparator implements Comparator {



    @Override
    public int compare(Object o1, Object o2) {
        GoodEntity g1=(GoodEntity)o1;
        GoodEntity g2=(GoodEntity)o2;
        double diff = g1.getGoodRate()-g2.getGoodRate();
        if (diff > 0)
            return 1;
        if (diff < 0)
            return -1;
        else
            return 0;
    }
}
