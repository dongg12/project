package com.wd.admin.pagehelper;


import com.github.pagehelper.PageInfo;
import com.wd.admin.entity.PmsProduct;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PageUtils {

    public static <T,R> PageVo<R> rebuildPageData(PageInfo<T> pageInfo, Function<T, R> function) {
        List<T> list = pageInfo.getList();
        List<R> returnList = list.stream().map(function).collect(Collectors.toList());
        return new PageVo<R>(pageInfo.getPageNum(),pageInfo.getPageSize(),pageInfo.getTotal(), pageInfo.getPages(),returnList);
    }
}
