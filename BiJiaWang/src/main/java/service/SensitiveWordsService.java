package service;

import model.SensitiveEntity;

import java.util.List;

/**
 * Created by caosh on 2017/4/13.
 */
public interface SensitiveWordsService {

    boolean addShieldWords(SensitiveEntity sensitiveEntity);

    boolean deleteShieldWords(SensitiveEntity sensitiveEntity);

    List findAll();
}
