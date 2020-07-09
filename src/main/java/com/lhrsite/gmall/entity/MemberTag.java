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
    * 用户标签表
    */
@ApiModel(value="com-lhrsite-gmall-entity-MemberTag")
@Data
@Builder
public class MemberTag implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    @ApiModelProperty(value="")
    private String name;

    /**
    * 自动打标签完成订单数量
    */
    @ApiModelProperty(value="自动打标签完成订单数量")
    private Integer finishOrderCount;

    /**
    * 自动打标签完成订单金额
    */
    @ApiModelProperty(value="自动打标签完成订单金额")
    private BigDecimal finishOrderAmount;

    private static final long serialVersionUID = 1L;
}