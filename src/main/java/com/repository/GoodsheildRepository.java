package com.repository;

import com.model.GoodshieldEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GoodsheildRepository extends JpaRepository<GoodshieldEntity,Integer> {
}
