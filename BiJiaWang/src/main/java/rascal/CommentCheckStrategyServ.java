package rascal;

import  model.CommentEntity;

import java.util.Collection;

/**
 * Created by user on 2017/4/12.
 */
public interface CommentCheckStrategyServ extends RascalCheckServ {

    boolean Check(CommentEntity ce, Collection<CommentEntity> c);
}
