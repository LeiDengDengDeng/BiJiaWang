package com.repository;

import com.model.GoodEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface GoodRepository extends JpaRepository<GoodEntity,Integer> {


    @Transactional
    @Query("select '*' from GoodEntity where GoodEntity .name=?1")
    String searchGood(String goodName);

}
