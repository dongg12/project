package com.wd.admin.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wd.admin.Vo.PmsProductVo;
import com.wd.admin.dao.PmsProductDao;
import com.wd.admin.entity.PmsProduct;
import com.wd.admin.pagehelper.PageUtils;
import com.wd.admin.pagehelper.PageVo;
import com.wd.admin.request.QueryListReq;
import com.wd.admin.service.PmsProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.Collections;
import java.util.Date;
import java.util.List;

@Service
public class PmsProductServiceImpl implements PmsProductService {

    @Autowired
    private PmsProductDao pmsProductDao;

    @Override
    public void addProduct(PmsProduct product) {
        product.setGmtCreate(new Date());
        product.setGmtModified(new Date());
        pmsProductDao.addProduct(product);
    }

    @Override
    public void updateProduct(PmsProduct product) {
        product.setGmtModified(new Date());
        pmsProductDao.updateProduct(product);
    }

    @Override
    public PmsProduct getById(Long id) {
        return pmsProductDao.getById(id).orElse(null);
    }

    @Override
    public PageVo<PmsProductVo> listByPage(QueryListReq queryListReq) {
        Integer pageNum = queryListReq.getPageNum();
        Integer pageSize = queryListReq.getPageSize();
        PageHelper.startPage(pageNum, queryListReq.getPageSize());
        List<PmsProduct> productList = pmsProductDao.listByPage(queryListReq).orElse(null);
        assert productList != null;
        PageInfo<PmsProduct> pageInfo = new PageInfo<>(productList);
        if (CollectionUtils.isEmpty(productList)) {
            return new PageVo<>(queryListReq.getPageNum(), queryListReq.getPageSize(), 0, 0, Collections.emptyList());
        }

        return PageUtils.rebuildPageData(pageInfo, item -> {
            PmsProductVo pmsProductVo = new PmsProductVo();
            BeanUtils.copyProperties(item, pmsProductVo);
            return pmsProductVo;
        });
    }
}
