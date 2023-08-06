package com.wd.admin.service;

import com.github.pagehelper.Page;
import com.wd.admin.Vo.PmsProductVo;
import com.wd.admin.entity.PmsProduct;
import com.wd.admin.pagehelper.PageVo;
import com.wd.admin.request.AddProductReq;
import com.wd.admin.request.QueryListReq;

import java.util.List;

public interface PmsProductService {
    /**
     * 新增商品
     *
     * @param product PmsProduct
     */
    void addProduct(PmsProduct product);

    /**
     * 修改商品
     *
     * @param product PmsProduct
     */
    void updateProduct(PmsProduct product);

    /**
     * 根据id查询数据
     * 
     * @param id Long
     * @return PmsProduct
     */
    PmsProduct getById(Long id);

    /**
     * 分页查询
     *
     * @param queryListReq QueryListReq
     * @return PmsProduct
     */
    PageVo<PmsProductVo> listByPage(QueryListReq queryListReq);
}
