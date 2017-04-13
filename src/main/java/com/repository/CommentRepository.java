package com.repository;

import com.model.CommentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Map;

/**
 * Created by 蒋香香 on 2017/4/13.
 */
public interface CommentRepository extends JpaRepository<CommentEntity,Integer> {
    Map<String,Object> deleteCommand(int id);
}
