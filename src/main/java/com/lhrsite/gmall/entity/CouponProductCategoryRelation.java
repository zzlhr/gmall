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
    * 优惠券和产品分类关系表
    */
@ApiModel(value="com-lhrsite-gmall-entity-CouponProductCategoryRelation")
@Data
@Builder
public class CouponProductCategoryRelation implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    @ApiModelProperty(value="")
    private Long couponId;

    @ApiModelProperty(value="")
    private Long productCategoryId;

    /**
    * 产品分类名称
    */
    @ApiModelProperty(value="产品分类名称")
    private String productCategoryName;

    /**
    * 父分类名称
    */
    @ApiModelProperty(value="父分类名称")
    private String parentCategoryName;

    private static final long serialVersionUID = 1L;
}