package com.service;

import com.model.SensitiveEntity;

import java.util.List;

/**
 * Created by caosh on 2017/4/13.
 */
public interface SensitiveWordsService {

    public boolean addShieldWords(SensitiveEntity sensitiveEntity);

    public boolean deleteShieldWords(SensitiveEntity sensitiveEntity);

    public List findAll();

    public int getCount();
}
