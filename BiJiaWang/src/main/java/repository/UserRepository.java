package repository;

import model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * Created by luoxuechun on 2017/4/13.
 */

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Integer>{
    @Query("select u.password from UserEntity u where u.userName=?1" )
    String getPassWord(String uname);
}
