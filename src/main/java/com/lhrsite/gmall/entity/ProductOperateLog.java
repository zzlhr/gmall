package com.lhrsite.gmall.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Builder;
import lombok.Data;

/**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
@ApiModel(value="com-lhrsite-gmall-entity-ProductOperateLog")
@Data
@Builder
public class ProductOperateLog implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    @ApiModelProperty(value="")
    private Long productId;

    @ApiModelProperty(value="")
    private BigDecimal priceOld;

    @ApiModelProperty(value="")
    private BigDecimal priceNew;

    @ApiModelProperty(value="")
    private BigDecimal salePriceOld;

    @ApiModelProperty(value="")
    private BigDecimal salePriceNew;

    /**
    * 赠送的积分
    */
    @ApiModelProperty(value="赠送的积分")
    private Integer giftPointOld;

    @ApiModelProperty(value="")
    private Integer giftPointNew;

    @ApiModelProperty(value="")
    private Integer usePointLimitOld;

    @ApiModelProperty(value="")
    private Integer usePointLimitNew;

    /**
    * 操作人
    */
    @ApiModelProperty(value="操作人")
    private String operateMan;

    @ApiModelProperty(value="")
    private Date createTime;

    private static final long serialVersionUID = 1L;
}