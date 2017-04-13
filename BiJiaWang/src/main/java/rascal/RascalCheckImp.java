package rascal;

import  model.CommentEntity;
import  model.UserEntity;

import java.util.Collection;

/**
 * Created by user on 2017/4/12.
 */
public class RascalCheckImp implements DataCheckStrategyServ,
                    CommentCheckStrategyServ{


    static final int STRNUM = 8;

    @Override
    public boolean isRascal(UserEntity ue, CommentEntity ce,
                            Collection<CommentEntity> c) {

        return Check(ce, c) || Check(ue, ce);
    }

    @Override
    public boolean Check(CommentEntity ce, Collection<CommentEntity> c) {

        String comment = ce.getContent();
        boolean isLongStr = comment.length() >= STRNUM;
        for(CommentEntity co : c) {
            if(isLongStr && co.getContent().equals(comment))
                return true;
        }
        return false;
    }

    @Override
    public boolean Check(UserEntity ue, CommentEntity ce) {
        Collection<CommentEntity> collect = ue.getCommentsByUserId();
        String comment = ce.getContent();
        boolean isLongStr = comment.length() >= STRNUM;
        for(CommentEntity c : collect) {
            if(isLongStr && c.getContent().equals(comment))
                return true;
        }

        return false;
    }
}
