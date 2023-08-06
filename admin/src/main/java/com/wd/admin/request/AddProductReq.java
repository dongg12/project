package com.wd.admin.request;

import com.wd.admin.entity.*;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class AddProductReq {
    /**
     * 商品阶梯价格设置
     */
    private List<PmsProductLadder> productLadderList;

    /**
     * 商品满减价格设置
     */
    private List<PmsProductFullReduction> productFullReductionList;

    /**
     * 商品会员价格设置
     */
    private List<PmsMemberPrice> memberPriceList;

    /**
     * 商品的sku库存信息
     */
    private List<PmsSkuStock> skuStockList;

    /**
     * 商品参数及自定义规格属性
     */
    private List<PmsProductAttributeValue> productAttributeValueList;

    /**
     * 专题和商品关系
     */
    private List<CmsSubjectProductRelation> subjectProductRelationList;

    /**
     * 优选专区和商品的关系
     */
    private List<CmsPrefrenceAreaProductRelation> prefrenceAreaProductRelationList;
}
