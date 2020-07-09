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
    * 后台用户登录日志表
    */
@ApiModel(value="com-lhrsite-gmall-entity-AdminLoginLog")
@Data
@Builder
public class AdminLoginLog implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    @ApiModelProperty(value="")
    private Long adminId;

    @ApiModelProperty(value="")
    private Date createTime;

    @ApiModelProperty(value="")
    private String ip;

    @ApiModelProperty(value="")
    private String address;

    /**
    * 浏览器登录类型
    */
    @ApiModelProperty(value="浏览器登录类型")
    private String userAgent;

    private static final long serialVersionUID = 1L;
}