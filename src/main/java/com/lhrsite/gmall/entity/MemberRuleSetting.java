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
    * 会员积分成长规则表
    */
@ApiModel(value="com-lhrsite-gmall-entity-MemberRuleSetting")
@Data
@Builder
public class MemberRuleSetting implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    /**
    * 连续签到天数
    */
    @ApiModelProperty(value="连续签到天数")
    private Integer continueSignDay;

    /**
    * 连续签到赠送数量
    */
    @ApiModelProperty(value="连续签到赠送数量")
    private Integer continueSignPoint;

    /**
    * 每消费多少元获取1个点
    */
    @ApiModelProperty(value="每消费多少元获取1个点")
    private BigDecimal consumePerPoint;

    /**
    * 最低获取点数的订单金额
    */
    @ApiModelProperty(value="最低获取点数的订单金额")
    private BigDecimal lowOrderAmount;

    /**
    * 每笔订单最高获取点数
    */
    @ApiModelProperty(value="每笔订单最高获取点数")
    private Integer maxPointPerOrder;

    /**
    * 类型：0->积分规则；1->成长值规则
    */
    @ApiModelProperty(value="类型：0->积分规则；1->成长值规则")
    private Integer type;

    private static final long serialVersionUID = 1L;
}