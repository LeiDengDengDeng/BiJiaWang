package com.service;

/**
 * Created by caosh on 2017/4/13.
 */

import com.model.SynonymsEntity;
import com.repository.SynonymsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("synonymsService")
@Transactional
public class SynonymsServiceImpl implements SynonymsService {

    @Autowired
    SynonymsRepository synonymsRepository;

    @Override
    public boolean addSynonyms(SynonymsEntity synonymsEntity) {
        synonymsRepository.save(synonymsEntity);
        return true;
    }

    @Override
    public boolean deleteSynonyms(SynonymsEntity synonymsEntity) {
        synonymsRepository.delete(synonymsEntity.getId());
        return true;
    }

    @Override
    public List findAll() {
        return synonymsRepository.findAll();
    }
}
