package com.service;

import com.model.CommentEntity;
import com.model.GoodEntity;

import java.util.List;
import java.util.Map;

/**
 * Created by 蒋香香 on 2017/4/13.
 */
public class CommentServiceImpl implements CommentService{
    private CommentRepository commentRepository;
    @Override
    public List<CommentEntity> getAllComments(GoodEntity goodEntity) {
        return commentRepository.findAll();
    }

    @Override
    public CommentEntity getCommentById(int id) {
        return commentRepository.getOne(id);
    }

    @Override
    public CommentEntity saveComment(CommentEntity comment) {
        return commentRepository.saveAndFlush(comment);
    }

    @Override
    public Map<String, Object> deleteComment(int id) {
        return commentRepository.deleteCommand(id);
    }
}
