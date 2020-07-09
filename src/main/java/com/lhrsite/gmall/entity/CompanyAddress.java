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
    * 公司收发货地址表
    */
@ApiModel(value="com-lhrsite-gmall-entity-CompanyAddress")
@Data
@Builder
public class CompanyAddress implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    /**
    * 地址名称
    */
    @ApiModelProperty(value="地址名称")
    private String addressName;

    /**
    * 默认发货地址：0->否；1->是
    */
    @ApiModelProperty(value="默认发货地址：0->否；1->是")
    private Integer sendStatus;

    /**
    * 是否默认收货地址：0->否；1->是
    */
    @ApiModelProperty(value="是否默认收货地址：0->否；1->是")
    private Integer receiveStatus;

    /**
    * 收发货人姓名
    */
    @ApiModelProperty(value="收发货人姓名")
    private String name;

    /**
    * 收货人电话
    */
    @ApiModelProperty(value="收货人电话")
    private String phone;

    /**
    * 省/直辖市
    */
    @ApiModelProperty(value="省/直辖市")
    private String province;

    /**
    * 市
    */
    @ApiModelProperty(value="市")
    private String city;

    /**
    * 区
    */
    @ApiModelProperty(value="区")
    private String region;

    /**
    * 详细地址
    */
    @ApiModelProperty(value="详细地址")
    private String detailAddress;

    private static final long serialVersionUID = 1L;
}