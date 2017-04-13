package com.service;
import com.model.CommentEntity;
import com.model.GoodEntity;

import java.util.List;
import java.util.Map;

/**
 * Created by 蒋香香 on 2017/4/13.
 */
public interface CommentService {
    //查看某商品的所有评论信息s
    List<CommentEntity> getAllComments(GoodEntity goodEntity);
    //查看评论详细内容
    CommentEntity getCommentById(int id);
    //保存发表的评论
    CommentEntity saveComment(CommentEntity comment);
}
