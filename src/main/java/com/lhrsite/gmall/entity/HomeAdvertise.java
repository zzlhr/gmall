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
    * 首页轮播广告表
    */
@ApiModel(value="com-lhrsite-gmall-entity-HomeAdvertise")
@Data
@Builder
public class HomeAdvertise implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    @ApiModelProperty(value="")
    private String name;

    /**
    * 轮播位置：0->PC首页轮播；1->app首页轮播
    */
    @ApiModelProperty(value="轮播位置：0->PC首页轮播；1->app首页轮播")
    private Integer type;

    @ApiModelProperty(value="")
    private String pic;

    @ApiModelProperty(value="")
    private Date startTime;

    @ApiModelProperty(value="")
    private Date endTime;

    /**
    * 上下线状态：0->下线；1->上线
    */
    @ApiModelProperty(value="上下线状态：0->下线；1->上线")
    private Integer status;

    /**
    * 点击数
    */
    @ApiModelProperty(value="点击数")
    private Integer clickCount;

    /**
    * 下单数
    */
    @ApiModelProperty(value="下单数")
    private Integer orderCount;

    /**
    * 链接地址
    */
    @ApiModelProperty(value="链接地址")
    private String url;

    /**
    * 备注
    */
    @ApiModelProperty(value="备注")
    private String note;

    /**
    * 排序
    */
    @ApiModelProperty(value="排序")
    private Integer sort;

    private static final long serialVersionUID = 1L;
}