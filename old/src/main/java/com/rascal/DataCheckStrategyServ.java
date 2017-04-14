package com.rascal;

import com.model.CommentEntity;
import com.model.UserEntity;

/**
 * Created by user on 2017/4/12.
 */
public interface DataCheckStrategyServ extends RascalCheckServ {

    boolean Check(UserEntity ue, CommentEntity ce);
}
