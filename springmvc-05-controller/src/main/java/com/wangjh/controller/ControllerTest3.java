package com.wangjh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author WJH
 * @date 2021/12/26 下午5:50
 * @QQ 1151777592
 */
@Controller
@RequestMapping("/c3")
public class ControllerTest3 {

    @RequestMapping("/test1")
    public String test1(Model model) {
        model.addAttribute("msg" ,"这个是注解开发的ControllerTest3！");
        return "test1";
    }
}
