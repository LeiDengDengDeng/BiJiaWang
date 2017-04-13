package com.repository;

import com.model.GoodEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface GoodRepository extends JpaRepository<GoodEntity,Integer> {


    @Transactional
    @Query("select good from GoodEntity good where good.name like %?1%")
    List<GoodEntity> searchGood(String goodName);

    @Query("select good from GoodEntity good where good.detail=?1")
    List<GoodEntity> searchGoodByDetail(String goodDetail);

}
