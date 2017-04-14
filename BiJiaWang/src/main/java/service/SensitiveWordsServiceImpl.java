package service;

import model.SensitiveEntity;
import repository.SensitiveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by caosh on 2017/4/13.
 */
@Service("shieldWordsService")
@Transactional
public class SensitiveWordsServiceImpl implements SensitiveWordsService {
    @Autowired
    SensitiveRepository sensitiveRepository;

    @Override
    public boolean addSensitiveWords(SensitiveEntity sensitiveEntity) {
        sensitiveRepository.save(sensitiveEntity);
        return true;
    }

    @Override
    public boolean deleteSensitiveWords(SensitiveEntity sensitiveEntity) {
        sensitiveRepository.delete(sensitiveEntity.getId());
        return true;
    }

    @Override
    public List<SensitiveEntity> findAll() {
        return sensitiveRepository.findAll();
    }

    @Override
    public int getCount() {
        List<SensitiveEntity> sensitiveEntities = sensitiveRepository.findAll();
        return sensitiveEntities.size();
    }

    @Override
    public SensitiveEntity getOne(int id) {
        return sensitiveRepository.findOne(id);
    }
}
