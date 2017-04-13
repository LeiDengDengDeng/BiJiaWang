package com.repository;

import com.model.CommentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by luoxuechun on 2017/4/13.
 */
@Repository
public interface CommentRepository extends JpaRepository<CommentEntity,Integer> {

  @Query("select c.content from CommentEntity c where c.goodId=?1 and c.userId=?2")
  CommentEntity getCommentByUser(int gooid,int userid);

  @Query("select c.content from CommentEntity c where c.userId=?1")
  List<CommentEntity> getCommentList(int gooid);



}
