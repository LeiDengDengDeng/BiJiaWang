package com.repository;

import com.model.IpblacklistEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by luoxuechun on 2017/4/13.
 */
public interface IpblacklistRepository extends JpaRepository<IpblacklistEntity,Integer> {
}
