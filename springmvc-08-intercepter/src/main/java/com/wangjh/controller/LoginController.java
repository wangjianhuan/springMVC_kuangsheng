package com.wangjh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @author WJH
 * @date 2022/1/9 下午4:37
 * @QQ 1151777592
 */
@Controller
@RequestMapping("/User")
public class LoginController {

    @RequestMapping("/login")
    public String login(HttpSession session, String username, String password){
        //把用户的信息保存在session中；
        session.setAttribute("userLoginInfo",username);
        return "main";
    }

    @RequestMapping("/main")
    public String login(){
        return "main";
    }

    @RequestMapping("/goLogin")
    public String goLogin(){
        return "login";
    }
}
