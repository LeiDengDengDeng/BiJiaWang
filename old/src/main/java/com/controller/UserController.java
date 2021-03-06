package com.controller;

import com.model.UserEntity;
import com.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

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
    public String userLogin(HttpSession httpSession,String userName, String userPassword){
        return userService.login(httpSession,userName,userPassword);
    }

    //查看用户信息
    @RequestMapping("/getUser")
    public ModelAndView getUser(HttpSession httpSession) {
        ModelAndView mav=new ModelAndView("personal");
        UserEntity user=userService.getUserById(Integer.parseInt(httpSession.getAttribute("userId").toString()));
        mav.addObject("user",user);
        return mav;
    }


}
