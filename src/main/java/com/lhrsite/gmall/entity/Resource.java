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
    * 后台资源表
    */
@ApiModel(value="com-lhrsite-gmall-entity-Resource")
@Data
@Builder
public class Resource implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    /**
    * 创建时间
    */
    @ApiModelProperty(value="创建时间")
    private Date createTime;

    /**
    * 资源名称
    */
    @ApiModelProperty(value="资源名称")
    private String name;

    /**
    * 资源URL
    */
    @ApiModelProperty(value="资源URL")
    private String url;

    /**
    * 描述
    */
    @ApiModelProperty(value="描述")
    private String description;

    /**
    * 资源分类ID
    */
    @ApiModelProperty(value="资源分类ID")
    private Long categoryId;

    private static final long serialVersionUID = 1L;
}