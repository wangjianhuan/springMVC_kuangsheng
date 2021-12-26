package com.wangjh.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author WJH
 * @date 2021/12/26 下午11:34
 * @QQ 1151777592
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books {

    private int bookID;

    private String bookName;

    private int bookCounts;

    private String detail;
}
