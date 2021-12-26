package com.wangjh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author WJH
 * @date 2021/12/26 下午9:56
 * @QQ 1151777592
 */
@Controller
public class EncodingController {

    /**
     * 过滤器解决乱码
     * @param name 前端提交
     * @param model
     * @return JSP页面
     */
    @PostMapping("/e/t1")
    public String test1(String name, Model model) {
        model.addAttribute("msg", name);
        return "test";
    }
}
