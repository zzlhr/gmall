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
    * 运费模版
    */
@ApiModel(value="com-lhrsite-gmall-entity-FeightTemplate")
@Data
@Builder
public class FeightTemplate implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    @ApiModelProperty(value="")
    private String name;

    /**
    * 计费类型:0->按重量；1->按件数
    */
    @ApiModelProperty(value="计费类型:0->按重量；1->按件数")
    private Integer chargeType;

    /**
    * 首重kg
    */
    @ApiModelProperty(value="首重kg")
    private BigDecimal firstWeight;

    /**
    * 首费（元）
    */
    @ApiModelProperty(value="首费（元）")
    private BigDecimal firstFee;

    @ApiModelProperty(value="")
    private BigDecimal continueWeight;

    @ApiModelProperty(value="")
    private BigDecimal continmeFee;

    /**
    * 目的地（省、市）
    */
    @ApiModelProperty(value="目的地（省、市）")
    private String dest;

    private static final long serialVersionUID = 1L;
}