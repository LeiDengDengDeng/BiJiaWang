package service;

import model.GoodEntity;

import java.util.List;

/**
 * Created by liying on 2017/4/11.
 */
public interface SearchService {

     List<GoodEntity> analyse(String[] keywords);
}
