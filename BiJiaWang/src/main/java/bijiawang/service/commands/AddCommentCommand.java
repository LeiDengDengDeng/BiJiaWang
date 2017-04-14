package bijiawang.service.commands;

import bijiawang.service.Command;
import bijiawang.service.commands.util.ResultMessage;
import model.CommentEntity;
import service.CommentService;
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
        commentService.saveComment(this.comment);
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
