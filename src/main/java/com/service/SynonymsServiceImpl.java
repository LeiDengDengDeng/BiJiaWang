package com.service;

/**
 * Created by caosh on 2017/4/13.
 */

import com.model.SynonymsEntity;
import com.repository.SynonymsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
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

    @Override
    public List findSynonyms(String word) {
        int groupId=1;
        List<SynonymsEntity> synonymsEntities = synonymsRepository.findAll();
        List<SynonymsEntity> result = new ArrayList<>();
        for(int i=0;i<synonymsEntities.size();i++){
            if(synonymsEntities.get(i).getWord().equals(word)){
                groupId = synonymsEntities.get(i).getGroupid();
                break;
            }
        }

        for (int i=0;i<synonymsEntities.size();i++){
            if(synonymsEntities.get(i).getGroupid()== groupId){
                result.add(synonymsEntities.get(i));
                continue;
            }
        }

        return result;
    }

    @Override
    public int getCount() {
        return (int) synonymsRepository.count();
    }
}
