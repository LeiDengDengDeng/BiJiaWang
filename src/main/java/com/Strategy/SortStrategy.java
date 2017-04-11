package com.Strategy;

import java.util.List;

/**
 * Created by liying on 2017/4/11.
 */
public interface SortStrategy<E> {
    public List<E> sort(List<E> list);


}
