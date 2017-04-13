package com.service;

import com.model.UserEntity;
import com.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by 蒋香香 on 2017/4/13.
 */
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserEntity getUserById(int id) {
        return userRepository.getOne(id);
    }

    @Override
    public String login(HttpSession session,String username, String password) {
        username = username.trim();
        password = password.trim();
        if (username.length() == 0 || password.length() == 0) {
           return "error , 请把信息填写完整！";
        } else  {
            String pass= userRepository.getPassWord(username);

                if (!password.equals(pass)) {
                  return  "error, 用户名或密码错误！";
                } else {
                    session.setAttribute("userID",username);
                    return username;
                }
            }
    }
}
