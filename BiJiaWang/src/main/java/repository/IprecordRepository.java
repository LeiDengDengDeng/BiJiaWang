package repository;

import model.IprecordEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by luoxuechun on 2017/4/13.
 */

@Repository
public interface IprecordRepository extends JpaRepository<IprecordEntity,Integer> {
}
