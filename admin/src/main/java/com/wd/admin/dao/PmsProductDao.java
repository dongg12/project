package com.wd.admin.dao;

import com.wd.admin.entity.PmsProduct;
import com.wd.admin.mapper.PmsProductMapper;
import com.wd.admin.request.QueryListReq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class PmsProductDao {

    @Autowired
    private PmsProductMapper pmsProductMapper;


    public void addProduct(PmsProduct product) {
        pmsProductMapper.addProduct(product);
    }


    public Optional<PmsProduct> getById(Long id) {
        return Optional.ofNullable(pmsProductMapper.getById(id));
    }


    public Optional<List<PmsProduct>> listByPage(QueryListReq queryListReq) {
        return Optional.ofNullable(pmsProductMapper.listByPage(queryListReq));
    }

    public void updateProduct(PmsProduct product) {
        pmsProductMapper.updateProduct(product);
    }
}
