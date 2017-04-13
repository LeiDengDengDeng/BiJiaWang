package com.repository;

import com.model.SynonymsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by luoxuechun on 2017/4/13.
 */

@Repository
public interface SynonymsRepository extends JpaRepository<SynonymsEntity,Integer>{
}
