package com.wd.admin.mapper;

import com.wd.admin.entity.PmsProduct;
import com.wd.admin.request.QueryListReq;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface PmsProductMapper{

    /**
     * 根据id查询
     *
     * @param id Long
     * @return PmsProduct
     */
    PmsProduct getById(Long id);

    /**
     * 新增插入
     *
     * @param product PmsProduct
     */
    void addProduct(PmsProduct product);

    /**
     * 分页查询
     *
     * @param queryListReq QueryListReq
     * @return PmsProduct
     */
    List<PmsProduct> listByPage(QueryListReq queryListReq);

    /**
     * 修改
     *
     * @param product PmsProduct
     */
    void updateProduct(PmsProduct product);
}