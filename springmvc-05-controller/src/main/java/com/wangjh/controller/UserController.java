package com.wangjh.controller;

import com.wangjh.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author WJH
 * @date 2021/12/26 下午9:26
 * @QQ 1151777592
 */
@Controller
@RequestMapping("/user")
public class UserController {

    /**
     * localhost:8080/user/t1?name=xxx
     */
    @GetMapping("/t1")
    public String test1(@RequestParam("username") String name, Model model) {
        //接受前端参数
        System.out.println("接收到前端的参数");

        //将返回的参数传递给前端
        model.addAttribute("msg", name);
        return "test";
    }

    /**
     * 前端接受的是一个对象
     *
     * 1.接受前端用户传递的参数，判断参数的名字，假设名字直接在方法上，可以直接使用
     * 2.假设传递的是一个对象User，匹配User 对象中的字段名，如果名字一致则OK。否则匹配不到
     */
    @GetMapping("t2")
    public String test2(User user) {
        System.out.println(user.toString());
        return "test";
    }

    @GetMapping("t3")
    public String test3(ModelMap map){
        map.addAttribute("");

        return "test";

    }
}
