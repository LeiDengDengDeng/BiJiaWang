package rascal;

import  model.CommentEntity;
import  model.UserEntity;

import java.util.Collection;

/**
 * Created by user on 2017/4/12.
 */
public interface RascalCheckServ {

    boolean isRascal(UserEntity ue, CommentEntity ce, Collection<CommentEntity> c);
}
