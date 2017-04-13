package com.repository;

import com.model.IpblacklistEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by luoxuechun on 2017/4/13.
 */

@Repository
public interface IpblacklistRepository extends JpaRepository<IpblacklistEntity,Integer> {
}
