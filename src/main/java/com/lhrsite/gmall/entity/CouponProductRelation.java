package com.lhrsite.gmall.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.Builder;
import lombok.Data;

/**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
/**
    * 优惠券和产品的关系表
    */
@ApiModel(value="com-lhrsite-gmall-entity-CouponProductRelation")
@Data
@Builder
public class CouponProductRelation implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    @ApiModelProperty(value="")
    private Long couponId;

    @ApiModelProperty(value="")
    private Long productId;

    /**
    * 商品名称
    */
    @ApiModelProperty(value="商品名称")
    private String productName;

    /**
    * 商品编码
    */
    @ApiModelProperty(value="商品编码")
    private String productSn;

    private static final long serialVersionUID = 1L;
}