package com.wangjh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author WJH
 * @date 2021/12/26 下午6:10
 * @QQ 1151777592
 */
@Controller
public class ControllerTest4 {

    //原来的方式 ：http://localhost:8080/springmvc_05_controller_war_exploded/add?a=1&b=2
    //RestFul  ：http://localhost:8080/springmvc_05_controller_war_exploded/add/a/b

    @RequestMapping("/add/{a}/{b}")
    public String test(@PathVariable int a,@PathVariable int b, Model model) {
        int res = a + b;
        model.addAttribute("msg", "a+b的结果是：" + res);
        return "test1";
    }
}
