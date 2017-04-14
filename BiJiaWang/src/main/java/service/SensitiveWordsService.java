package service;

import model.SensitiveEntity;

import java.util.List;

/**
 * Created by caosh on 2017/4/13.
 */
public interface SensitiveWordsService {

    public boolean addSensitiveWords(SensitiveEntity sensitiveEntity);

    public boolean deleteSensitiveWords(SensitiveEntity sensitiveEntity);

    public List<SensitiveEntity> findAll();

    public int getCount();

    public SensitiveEntity getOne(int id);
}
