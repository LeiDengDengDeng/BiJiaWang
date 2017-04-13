package com.service;

import com.model.CommentEntity;
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
    public List<CommentEntity> getAllComments(int id) {
        return null;
    }

    @Override
    public CommentEntity getCommentById(int id) {
        return commentRepository.getOne(id);
    }

    @Override
    public boolean saveComment(CommentEntity comment) {

        commentRepository.saveAndFlush(comment);

        return true;
    }

    @Override
    public List<CommentEntity> getAllCommentsByUser(int goodid) {
        List<CommentEntity> commentEntities=commentRepository.getCommentList(goodid);
        return commentEntities;
    }

    @Override
    public CommentEntity getComment(int userid, int goodid) {
        CommentEntity commentEntity=commentRepository.getCommentByUser(goodid,userid);
        return commentEntity;
    }

}
