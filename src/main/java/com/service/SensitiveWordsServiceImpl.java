package com.service;

import com.model.SensitiveEntity;
import com.repository.SensitiveRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by caosh on 2017/4/13.
 */
@Service("shieldWordsService")
@Transactional
public class SensitiveWordsServiceImpl implements SensitiveWordsService {
    SensitiveRepository sensitiveRepository;

    @Override
    public boolean addShieldWords(SensitiveEntity sensitiveEntity) {
        sensitiveRepository.save(sensitiveEntity);
        return true;
    }

    @Override
    public boolean deleteShieldWords(SensitiveEntity sensitiveEntity) {
        sensitiveRepository.delete(sensitiveEntity.getId());
        return true;
    }

    @Override
    public List findAll() {
        return sensitiveRepository.findAll();
    }
}
