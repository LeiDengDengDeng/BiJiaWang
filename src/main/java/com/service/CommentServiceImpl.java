package com.service;

import com.model.CommentEntity;
import com.model.GoodEntity;
import com.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by 蒋香香 on 2017/4/13.
 */
public class CommentServiceImpl implements CommentService{

    @Autowired
    private CommentRepository commentRepository;

    @Override
    public List<CommentEntity> getAllComments(GoodEntity goodEntity) {
        List<CommentEntity> result=commentRepository.findAll();
        return  result;
    }

    @Override
    public CommentEntity getCommentById(int id) {
        return commentRepository.getOne(id);
    }

    @Override
    public CommentEntity saveComment(CommentEntity comment) {
        return commentRepository.saveAndFlush(comment);
    }

}
