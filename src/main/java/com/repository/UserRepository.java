package com.repository;

import com.model.GoodEntity;
import com.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * Created by 蒋香香 on 2017/4/13.
 */
@Repository
public interface UserRepository  extends JpaRepository<UserEntity,Integer> {
    //登陆
    UserEntity findByNameAndPassword(String name, String password);
//删除用户
    Map<String,Object> deleteUser(int id);
}
