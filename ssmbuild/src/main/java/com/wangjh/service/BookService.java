package com.wangjh.service;

import com.wangjh.pojo.Books;

import java.util.List;

/**
 * @author WJH
 * @date 2021/12/26 下午11:58
 * @QQ 1151777592
 */
public interface BookService {

    /**
     * 增加一本书
     *
     * @param books
     * @return 操作的行数
     */
    int addBook(Books books);

    /**
     * 删除一本书
     *
     * @param id
     * @return 操作的行数
     */
    int deleteBookById(int id);

    /**
     * 更新一本书
     *
     * @param books
     * @return 操作的行数
     */
    int updateBooks(Books books);

    /**
     * 查询一本书
     *
     * @param id
     * @return 书的详情
     */
    Books queryBooksById(int id);

    /**
     * 查询全部的书
     *
     * @return List<Books>
     */
    List<Books> queryAllBooks();
}
