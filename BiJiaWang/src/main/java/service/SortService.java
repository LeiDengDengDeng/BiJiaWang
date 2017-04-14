package service;

import model.GoodEntity;
import strategy.SortStrategy;

import java.util.List;

/**
 * Created by liying on 2017/4/11.
 */
public interface SortService {

     List<GoodEntity> sort(List<GoodEntity> list, SortStrategy sortStrategy);
}
