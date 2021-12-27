package com.wangjh.controller;

import com.wangjh.pojo.Books;
import com.wangjh.service.BookService;
import org.apache.ibatis.type.SimpleTypeRegistry;
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

    /**
     * 查询全部的书籍，并且返回到一个书籍展示的页面
     *
     * @param model 添加数据
     * @return 返回书籍
     */
    @RequestMapping("/allBook")
    public String list(Model model) {
        List<Books> books = bookService.queryAllBooks();
        model.addAttribute("list", books);
        return "allBook";
    }

    /**
     * 跳转页面
     * @return
     */
    @RequestMapping("/toAddBook")
    public String toAddBook() {
        return "addBook";
    }

    @RequestMapping("/addBook")
    public String addBook(Books books){
        System.out.println("addBook =====>>> " +books);
        bookService.addBook(books);
        //重定向
        return "redirect:book/allBook";
    }

}
