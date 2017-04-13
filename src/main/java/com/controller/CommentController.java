package com.controller;

import com.model.CommentEntity;
import com.model.GoodEntity;
import com.model.UserEntity;
import com.service.CommentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

/**
 * Created by 蒋香香 on 2017/4/13.
 */
@Controller
@RequestMapping
public class CommentController{
    private CommentService commentService;
    //添加评论
    @RequestMapping("/addComment")
    public CommentEntity addComment(int commentID, String content, Timestamp time, UserEntity userByUserId, GoodEntity goodByGoodId) {
        CommentEntity comment= new CommentEntity();
        if (commentService==null ){
            System.out.println("comment service null");
        }
        comment.setCommentId(commentID);
        comment.setGoodByGoodId(goodByGoodId);
        comment.setUserByUserId(userByUserId);
        comment.setContent(content);
        comment.setTime(new Timestamp(System.currentTimeMillis()));
//        if(sensitiveWords(content)){
//            //通知管理员
//            commentService=null;
//        }else if(isRasacal(userByUserId,goodByGoodId,comment)){
//            //通知管理员
//            commentService=null;
//        }
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
    public List<CommentEntity> getCommonList(GoodEntity goodByGoodId, int commentID){
        CommentEntity comment= commentService.getCommentById(commentID);
        return commentService.getAllComments(goodByGoodId);
    }

    //删除评论
    @RequestMapping("/deleteComment")
    public Map<String, Object> deleteComment(int commentID){
        CommentEntity comment= commentService.getCommentById(commentID);
        if (commentService==null ){
            System.out.println("comment service null");
        }
        return  commentService.deleteComment(commentID);
    }


//    public boolean sensitiveWords(String str){
//        return false;
//        //// TODO: 2017/4/12
//    }
//
//    public boolean isRasacal(UserEntity userEntity, GoodEntity goodByGoodId, CommentEntity comment){
//        return false;
//        //// TODO: 2017/4/12
//    }


}