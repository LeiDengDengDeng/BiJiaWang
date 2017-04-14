package repository;

import model.SensitiveEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by luoxuechun on 2017/4/13.
 */
@Repository
public interface SensitiveRepository extends JpaRepository<SensitiveEntity,Integer>{

}
