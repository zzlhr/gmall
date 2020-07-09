package com.lhrsite.gmall.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Builder;
import lombok.Data;

/**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
/**
    * sku的库存
    */
@ApiModel(value="com-lhrsite-gmall-entity-SkuStock")
@Data
@Builder
public class SkuStock implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    @ApiModelProperty(value="")
    private Long productId;

    /**
    * sku编码
    */
    @ApiModelProperty(value="sku编码")
    private String skuCode;

    @ApiModelProperty(value="")
    private BigDecimal price;

    /**
    * 库存
    */
    @ApiModelProperty(value="库存")
    private Integer stock;

    /**
    * 预警库存
    */
    @ApiModelProperty(value="预警库存")
    private Integer lowStock;

    /**
    * 展示图片
    */
    @ApiModelProperty(value="展示图片")
    private String pic;

    /**
    * 销量
    */
    @ApiModelProperty(value="销量")
    private Integer sale;

    /**
    * 单品促销价格
    */
    @ApiModelProperty(value="单品促销价格")
    private BigDecimal promotionPrice;

    /**
    * 锁定库存
    */
    @ApiModelProperty(value="锁定库存")
    private Integer lockStock;

    /**
    * 商品销售属性，json格式
    */
    @ApiModelProperty(value="商品销售属性，json格式")
    private String spData;

    private static final long serialVersionUID = 1L;
}