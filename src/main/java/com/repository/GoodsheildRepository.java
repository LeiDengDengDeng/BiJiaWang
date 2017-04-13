package com.repository;

import com.model.GoodshieldEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by luoxuechun on 2017/4/13.
 */
@Repository
public interface GoodsheildRepository extends JpaRepository<GoodshieldEntity,Integer>{

}