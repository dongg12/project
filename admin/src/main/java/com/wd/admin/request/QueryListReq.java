package com.wd.admin.request;

import lombok.Data;

@Data
public class QueryListReq {
    /**
     * 每页大小
     */
    private Integer pageSize;

    /**
     * 页数
     */
    private Integer pageNum;

    /**
     * 根据名字模糊查询
     */
    private String name;
}
