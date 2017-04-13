package service;

import model.UserEntity;
import repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

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
    public boolean login(String username, String password) {
        Map<String, Object> map = new HashMap<>();
        boolean isLogin=false;
        username = username.trim();
        password = password.trim();
        if (username.length() == 0 || password.length() == 0) {
            map.put("success", false);
            map.put("error", "请把信息填写完整！");
        } else  {
            String pass= userRepository.getPassWord(username);

                if (!password.equals(pass)) {
                    map.put("success", false);
                    map.put("error", "用户名或密码错误！");
                } else {
                    map.put("success", true);
                    map.put("user_name", username);
                    isLogin=true;
                }
            }

        return isLogin;
    }

}
