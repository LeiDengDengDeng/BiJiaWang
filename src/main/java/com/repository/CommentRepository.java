package com.repository;

import com.model.CommentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * Created by luoxuechun on 2017/4/13.
 */
public interface CommentRepository extends JpaRepository<CommentRepository,Integer> {

  @Query("select c.content from CommentEntity c where c.goodByGoodId.goodId=?1")
    CommentEntity getComment(int gooid);

}
