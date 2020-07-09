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
    * 商品限时购与商品关系表
    */
@ApiModel(value="com-lhrsite-gmall-entity-FlashPromotionProductRelation")
@Data
@Builder
public class FlashPromotionProductRelation implements Serializable {
    /**
    * 编号
    */
    @ApiModelProperty(value="编号")
    private Long id;

    @ApiModelProperty(value="")
    private Long flashPromotionId;

    /**
    * 编号
    */
    @ApiModelProperty(value="编号")
    private Long flashPromotionSessionId;

    @ApiModelProperty(value="")
    private Long productId;

    /**
    * 限时购价格
    */
    @ApiModelProperty(value="限时购价格")
    private BigDecimal flashPromotionPrice;

    /**
    * 限时购数量
    */
    @ApiModelProperty(value="限时购数量")
    private Integer flashPromotionCount;

    /**
    * 每人限购数量
    */
    @ApiModelProperty(value="每人限购数量")
    private Integer flashPromotionLimit;

    /**
    * 排序
    */
    @ApiModelProperty(value="排序")
    private Integer sort;

    private static final long serialVersionUID = 1L;
}