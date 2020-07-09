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
    * 会员登录记录
    */
@ApiModel(value="com-lhrsite-gmall-entity-MemberLoginLog")
@Data
@Builder
public class MemberLoginLog implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    @ApiModelProperty(value="")
    private Long memberId;

    @ApiModelProperty(value="")
    private Date createTime;

    @ApiModelProperty(value="")
    private String ip;

    @ApiModelProperty(value="")
    private String city;

    /**
    * 登录类型：0->PC；1->android;2->ios;3->小程序
    */
    @ApiModelProperty(value="登录类型：0->PC；1->android;2->ios;3->小程序")
    private Integer loginType;

    @ApiModelProperty(value="")
    private String province;

    private static final long serialVersionUID = 1L;
}