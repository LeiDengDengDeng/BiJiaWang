package com.controller;

import com.model.UserEntity;
import com.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * Created by 蒋香香 on 2017/4/13.
 */
@Controller
@RequestMapping
public class UserController {
    private UserService userService;
    private UserEntity user;

    //登陆
    @RequestMapping("/userLogin")
    public Map<String, Object> userLogin(String userName, String userPassword){
//        if(userName=="commonUser1"){
//// TODO: 2017/4/12
//        }else if(userName=="admin1"){
//// TODO: 2017/4/12
//        }
        return userService.login(userName,userPassword);
    }

    //查看用户信息
    @RequestMapping("/getUser")
    public ModelAndView getUser(HttpSession httpSession) {
        ModelAndView mav=new ModelAndView("personal");
        UserEntity user=userService.getUserById(Integer.parseInt(httpSession.getAttribute("userId").toString()));
        mav.addObject("user",user);
        return mav;
    }


    //管理员管理水军
    @RequestMapping("/disableUser")
    public Map<String, Object> disableUser(int userId){
        UserEntity userEntity= userService.getUserById(userId);
        if (userService==null ){
            System.out.println("user service null");
        }
        return   userService.deleteUser(userId);
    }
}
