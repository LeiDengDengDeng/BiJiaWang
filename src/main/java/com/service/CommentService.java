package com.service;

import com.model.CommentEntity;

import java.util.List;

/**
 * Created by 蒋香香 on 2017/4/13.
 */
public interface CommentService {
    //查看某商品的所有评论信息
    List<CommentEntity> getAllComments(int id);
    //查看评论详细内容
    CommentEntity getCommentById(int id);
    //保存发表的评论
    boolean saveComment(CommentEntity comment);

    //查看某一用户所有评论
    List<CommentEntity> getAllCommentsByUser(int userid);

    //查看某一用户对当前产品的评论
    CommentEntity getComment(int userid,int goodid);

}
