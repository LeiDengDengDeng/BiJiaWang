package com.bijiawang.service.commands;

import com.bijiawang.service.Command;
import com.bijiawang.service.commands.util.ResultMessage;
import com.model.CommentEntity;
import com.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by disinuo on 17/4/13.
 */
public class AddCommentCommand extends Command{
    @Autowired
    CommentService commentService;
    private CommentEntity comment;


    @Override
    protected ResultMessage doCommand(){
        this.comment=commentService.saveComment(this.comment);
        return null;
    }


    public AddCommentCommand(CommentEntity comment){
        this.comment=comment;
        args.put("comment",comment);
    }
    @Override
    protected void initCommandId() {
        commandId="service.commands.AddCommentCommand";
    }
    public CommentEntity getComment() {
        return comment;
    }
}
