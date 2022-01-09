package com.wangjh.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author WJH
 * @date 2022/1/9 下午2:29
 * @QQ 1151777592
 */
@RestController
public class TestController {

    @RequestMapping("t1")
    public String test() {
        System.out.println("TestController === test方法执行了！");
        return "ok";
    }
}
