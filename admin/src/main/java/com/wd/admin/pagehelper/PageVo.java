package com.wd.admin.pagehelper;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageVo<T> {
    /**
     * 当前页
     */
    private int currentPageNum;

    /**
     * 每页数量
     */
    private int currentPageSize;

    /**
     * 总条数
     */
    private long totalNum;

    /**
     * 总页数
     */
    private int totalPages;

    /**
     * 存放数据
     */
    private List<T> pageList;
}
