package com.service;

import com.model.UserEntity;

import java.util.Map;

/**
 * Created by 蒋香香 on 2017/4/13.
 */
public interface UserService {

    //查看用户详细信息
    UserEntity getUserById(int id);

    //登陆
    boolean login(String username, String password);
}
