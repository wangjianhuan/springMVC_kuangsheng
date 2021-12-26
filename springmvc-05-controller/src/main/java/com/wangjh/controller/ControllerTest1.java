package com.wangjh.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author WJH
 * @date 2021/12/26 下午5:19
 * @QQ 1151777592
 * 只要实现了 Controller 接口的类  说明这就是一个控制器了
 */
public class ControllerTest1 implements Controller {
    /**
     * Process the request and return a ModelAndView object which the DispatcherServlet
     * will render. A {@code null} return value is not an error: it indicates that
     * this object completed request processing itself and that there is therefore no
     * ModelAndView to render.
     *
     * @param request  current HTTP request
     * @param response current HTTP response
     * @return a ModelAndView to render, or {@code null} if handled directly
     * @throws Exception in case of errors
     */
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg" ,"这个是实现了Controller接口！");
        modelAndView.setViewName("test1");
        return modelAndView;
    }
}
