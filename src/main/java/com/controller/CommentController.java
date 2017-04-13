package com.controller;

import com.model.CommentEntity;
import com.model.GoodEntity;
import com.model.UserEntity;
import com.rascal.RascalCheckServ;
import com.service.CommentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.sql.Timestamp;
import java.util.List;

/**
 * Created by 蒋香香 on 2017/4/13.
 */
@Controller
@RequestMapping
public class CommentController{
    private CommentService commentService;
    private RascalCheckServ ras;
    //添加评论
    @RequestMapping("/addComment")
    public boolean addComment(int commentID, String content, Timestamp time, UserEntity userByUserId, GoodEntity goodByGoodId) {
        CommentEntity comment= new CommentEntity();
        if (commentService==null ){
            System.out.println("comment service null");
        }
        comment.setCommentId(commentID);
        comment.setGoodByGoodId(goodByGoodId);
        comment.setUserByUserId(userByUserId);
        comment.setContent(content);
        comment.setTime(new Timestamp(System.currentTimeMillis()));

        List<CommentEntity> commentList=null;

        if(ras.isRascal(userByUserId,comment,commentList)){
            //通知管理员
            commentService=null;
 }

//        ras.isRascal( );

        return commentService.saveComment(comment);
    }

    //查看某个评论的详细内容
    @RequestMapping("/getComment")
    public ModelAndView getComment(HttpSession httpSession) {
        ModelAndView mav=new ModelAndView("comments");
        CommentEntity comment=commentService.getCommentById(Integer.parseInt(httpSession.getAttribute("comment").toString()));
        mav.addObject("comment",comment);
        return mav;
    }

    //查看某个商品的所有评论
    @RequestMapping("/getCommentList")
    public List<CommentEntity> getCommonList(int commentID){
        CommentEntity comment= commentService.getCommentById(commentID);
        int id=comment.getCommentId();
        return commentService.getAllComments(id);
    }


}