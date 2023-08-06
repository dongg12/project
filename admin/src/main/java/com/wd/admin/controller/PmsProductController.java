package com.wd.admin.controller;

import api.CommonResult;
import com.github.pagehelper.Page;
import com.wd.admin.Vo.PmsProductVo;
import com.wd.admin.entity.PmsProduct;
import com.wd.admin.pagehelper.PageVo;
import com.wd.admin.request.GetByIdRequest;
import com.wd.admin.request.QueryListReq;
import com.wd.admin.service.PmsProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/item")
public class PmsProductController {

    @Autowired
    private PmsProductService pmsProductService;

    /**
     * 新增商品
     *
     * @param product PmsProduct
     * @return CommonResult
     */
    @PostMapping("/addProduct")
    public CommonResult<String> addProduct(@RequestBody PmsProduct product) {
        pmsProductService.addProduct(product);
        return CommonResult.success();
    }


    /**
     * 修改商品信息
     *
     * @param product PmsProduct
     * @return CommonResult
     */
    @PostMapping("/updateProduct")
    public CommonResult<String> updateProduct(@RequestBody PmsProduct product) {
        pmsProductService.updateProduct(product);
        return CommonResult.success();
    }


    /**
     * 根据id获取商品信息
     *
     * @param getByIdRequest GetByIdRequest
     * @return PmsProduct
     */
    @PostMapping("/getById")
    public CommonResult<PmsProduct> getById(@RequestBody @Validated GetByIdRequest getByIdRequest) {

        PmsProduct product = pmsProductService.getById(getByIdRequest.getId());
        return CommonResult.success(product);
    }

    @PostMapping("/listByPage")
    public CommonResult<PageVo<PmsProductVo>> listByPage(@RequestBody @Validated QueryListReq queryListReq) {

        PageVo<PmsProductVo> productList = pmsProductService.listByPage(queryListReq);
        return CommonResult.success(productList);
    }


}