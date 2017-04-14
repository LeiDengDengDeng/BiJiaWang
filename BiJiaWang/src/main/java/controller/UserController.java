package controller;

import model.UserEntity;
import service.UserService;
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
    public boolean userLogin(String userName, String userPassword){
//        if(userName=="commonUser1"){

//        }else if(userName=="admin1"){

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


}
