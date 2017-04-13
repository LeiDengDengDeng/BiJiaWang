package com.service;

import com.model.UserEntity;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 蒋香香 on 2017/4/13.
 */
public class UserServiceImpl implements UserService{

    private UserRepository userRepository;

    @Override
    public UserEntity getUserById(int id) {
        return userRepository.getOne(id);
    }

    @Override
    public Map<String, Object> login(String username, String password) {
        Map<String, Object> map = new HashMap<>();
        username = username.trim();
        password = password.trim();
        if (username.length() == 0 || password.length() == 0) {
            map.put("success", false);
            map.put("error", "请把信息填写完整！");
        } else  {
            UserEntity user = userRepository.findByNameAndPassword(username,password);
            if (user == null) {
                map.put("success", false);
                map.put("error", "用户名或密码错误！");
            } else {
                if (!password.equals(user.getPassword())) {
                    map.put("success", false);
                    map.put("error", "用户名或密码错误！");
                } else {
                    map.put("success", true);
                    map.put("user_id", user.getUserId());
                    map.put("user_name", user.getUserName());
                }
            }
        }
        return map;
    }

    @Override
    public Map<String, Object> deleteUser(int id) {
        return userRepository.deleteUser(id);
    }
}
