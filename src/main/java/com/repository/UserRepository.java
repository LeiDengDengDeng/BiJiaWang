package com.repository;

import com.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by luoxuechun on 2017/4/13.
 */
public interface UserRepository extends JpaRepository<UserEntity,Integer>{
}