package com.wangjh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author WJH
 * @date 2021/12/26 下午5:29
 * @QQ 1151777592
 */
@Controller
public class ControllerTest2 {

    @RequestMapping("test2")
    public String test1(Model model){
        model.addAttribute("msg" ,"这个是注解开发的Controller！");
        return "test";
    }
}
