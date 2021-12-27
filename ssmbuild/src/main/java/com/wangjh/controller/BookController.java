package com.wangjh.controller;

import com.wangjh.pojo.Books;
import com.wangjh.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author WJH
 * @date 2021/12/27 下午10:32
 * @QQ 1151777592
 */
@Controller
@RequestMapping("/book")
public class BookController {

    /**
     * controller 调 service 层
     */
    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;

    @RequestMapping("/allBook")
    public String list(Model model) {
        List<Books> books = bookService.queryAllBooks();
        model.addAttribute("list", books);
        return "allBook";
    }

}
