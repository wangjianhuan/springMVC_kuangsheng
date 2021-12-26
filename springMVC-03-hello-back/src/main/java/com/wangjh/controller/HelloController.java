package com.wangjh.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author WJH
 * @date 2021/12/26 下午4:06
 * @QQ 1151777592
 */
public class HelloController implements Controller {

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

        //业务代码
        String result = "Hello SpringMVC!";
        modelAndView.addObject("msg",result);

        //视图跳转
        modelAndView.setViewName("test");

        return modelAndView;
    }
}
