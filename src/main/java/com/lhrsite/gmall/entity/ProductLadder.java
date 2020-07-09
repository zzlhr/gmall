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
    * 产品阶梯价格表(只针对同商品)
    */
@ApiModel(value="com-lhrsite-gmall-entity-ProductLadder")
@Data
@Builder
public class ProductLadder implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    @ApiModelProperty(value="")
    private Long productId;

    /**
    * 满足的商品数量
    */
    @ApiModelProperty(value="满足的商品数量")
    private Integer count;

    /**
    * 折扣
    */
    @ApiModelProperty(value="折扣")
    private BigDecimal discount;

    /**
    * 折后价格
    */
    @ApiModelProperty(value="折后价格")
    private BigDecimal price;

    private static final long serialVersionUID = 1L;
}