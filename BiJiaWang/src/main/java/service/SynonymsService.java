package service;

import model.SynonymsEntity;

import java.util.List;

/**
 * Created by caosh on 2017/4/13.
 */
public interface SynonymsService {

    boolean addSynonyms(SynonymsEntity synonymsEntity);

    boolean deleteSynonyms(SynonymsEntity synonymsEntity);

    List findAll();
}
