package com.wangjh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author WJH
 * @date 2021/12/26 下午4:40
 * @QQ 1151777592
 */
@Controller
public class HelloController {

    @RequestMapping("/test")
    public String hello(Model model) {

        //封装数据
        model.addAttribute("msg","hello,Annotation!");
        //返回view  会被视图解析器处理
        return "hello";
    }
}
