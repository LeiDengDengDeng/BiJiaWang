package service;

import model.SynonymsEntity;

import java.util.List;

/**
 * Created by caosh on 2017/4/13.
 */
public interface SynonymsService {

    public boolean addSynonyms(SynonymsEntity synonymsEntity);

    public boolean deleteSynonyms(SynonymsEntity synonymsEntity);

    public List<SynonymsEntity> findAll();

    public List<SynonymsEntity> findSynonyms(String word);

    public int getCount();

    public SynonymsEntity getOne(int id);
}
