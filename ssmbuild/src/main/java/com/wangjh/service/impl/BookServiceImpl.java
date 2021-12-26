package com.wangjh.service.impl;

import com.wangjh.dao.BookMapper;
import com.wangjh.pojo.Books;
import com.wangjh.service.BookService;

import java.util.List;

/**
 * @author WJH
 * @date 2021/12/26 下午11:59
 * @QQ 1151777592
 */
public class BookServiceImpl implements BookService {

    //service层 调 dao层： 组合DAO

    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    /**
     * 增加一本书
     *
     * @param books
     * @return 操作的行数
     */
    @Override
    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    /**
     * 删除一本书
     *
     * @param id
     * @return 操作的行数
     */
    @Override
    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    /**
     * 更新一本书
     *
     * @param books
     * @return 操作的行数
     */
    @Override
    public int updateBooks(Books books) {
        return bookMapper.updateBooks(books);
    }

    /**
     * 查询一本书
     *
     * @param id
     * @return 书的详情
     */
    @Override
    public Books queryBooksById(int id) {
        return bookMapper.queryBooksById(id);
    }

    /**
     * 查询全部的书
     *
     * @return List<Books>
     */
    @Override
    public List<Books> queryAllBooks() {
        return bookMapper.queryAllBooks();
    }
}
