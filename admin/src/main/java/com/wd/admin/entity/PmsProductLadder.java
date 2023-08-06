package com.wd.admin.entity;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class PmsProductLadder {
    private Long id;

    private Long productId;

    /**
     * 满足的商品数量
     */
    private Integer count;

    /**
     * 折扣
     */
    private BigDecimal discount;

    /**
     * 折后价格
     */
    private BigDecimal price;
}
