package com.lhrsite.gmall.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Builder;
import lombok.Data;

/**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
/**
    * 优惠券使用、领取历史表
    */
@ApiModel(value="com-lhrsite-gmall-entity-CouponHistory")
@Data
@Builder
public class CouponHistory implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    @ApiModelProperty(value="")
    private Long couponId;

    @ApiModelProperty(value="")
    private Long memberId;

    @ApiModelProperty(value="")
    private String couponCode;

    /**
    * 领取人昵称
    */
    @ApiModelProperty(value="领取人昵称")
    private String memberNickname;

    /**
    * 获取类型：0->后台赠送；1->主动获取
    */
    @ApiModelProperty(value="获取类型：0->后台赠送；1->主动获取")
    private Integer getType;

    @ApiModelProperty(value="")
    private Date createTime;

    /**
    * 使用状态：0->未使用；1->已使用；2->已过期
    */
    @ApiModelProperty(value="使用状态：0->未使用；1->已使用；2->已过期")
    private Integer useStatus;

    /**
    * 使用时间
    */
    @ApiModelProperty(value="使用时间")
    private Date useTime;

    /**
    * 订单编号
    */
    @ApiModelProperty(value="订单编号")
    private Long orderId;

    /**
    * 订单号码
    */
    @ApiModelProperty(value="订单号码")
    private String orderSn;

    private static final long serialVersionUID = 1L;
}