package com.repository;

import com.model.IprecordEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by luoxuechun on 2017/4/13.
 */
public interface IprecordRepository extends JpaRepository<IprecordEntity,Integer> {
}
