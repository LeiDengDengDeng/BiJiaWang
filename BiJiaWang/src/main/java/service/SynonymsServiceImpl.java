package service;

/**
 * Created by caosh on 2017/4/13.
 */

import model.SynonymsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import repository.SynonymsRepository;

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
    public List<SynonymsEntity> findAll() {
        return synonymsRepository.findAll();
    }

    @Override
    public List<String> findSynonyms(String word) {
        int groupId=1;
        List<SynonymsEntity> synonymsEntities = synonymsRepository.findAll();
        List<String> result = new ArrayList<>();
        for(int i=0;i<synonymsEntities.size();i++){
            if(synonymsEntities.get(i).getSynonymsWord().equals(word)){
                groupId = synonymsEntities.get(i).getGroupid();
                break;
            }
        }

        for (int i=0;i<synonymsEntities.size();i++){
            if(synonymsEntities.get(i).getGroupid()== groupId){
                result.add(synonymsEntities.get(i).getSynonymsWord());
                continue;
            }
        }

        return result;
    }

    @Override
    public int getCount() {
        List<SynonymsEntity> synonymsEntities = synonymsRepository.findAll();
        int max_Group = 1;
        for(int i=0;i<synonymsEntities.size();i++){
            if(synonymsEntities.get(i).getGroupid() > max_Group)
                max_Group = synonymsEntities.get(i).getGroupid();
        }
        return max_Group;
    }

    @Override
    public SynonymsEntity getOne(int id) {
        return synonymsRepository.findOne(id);
    }

    @Override
    public List<List<String>> getSynonymsGroup() {
        int max_Group = getCount();
        List<SynonymsEntity> synonymsEntities = synonymsRepository.findAll();
        int size = synonymsEntities.size();
        List<List<String>> result = new ArrayList<>();
        for(int i=1;i<=max_Group;i++){
            List<String> str = new ArrayList<>();
            for(int j=1;j<size;j++){
             if(synonymsEntities.get(j).getGroupid()==j)
                 str.add(synonymsEntities.get(j).getSynonymsWord());
            }
            result.add(str);
        }
        return result;
    }

//    public static void main(String[] args) {
//        SynonymsServiceImpl synonymsService = new SynonymsServiceImpl();
//        System.out.println(synonymsService.getCount());
//        System.out.println(synonymsService.getOne(2));
//        System.out.println(synonymsService.findAll().size());
//    }
}
