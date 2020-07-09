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
    * 资源分类表
    */
@ApiModel(value="com-lhrsite-gmall-entity-ResourceCategory")
@Data
@Builder
public class ResourceCategory implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    /**
    * 创建时间
    */
    @ApiModelProperty(value="创建时间")
    private Date createTime;

    /**
    * 分类名称
    */
    @ApiModelProperty(value="分类名称")
    private String name;

    /**
    * 排序
    */
    @ApiModelProperty(value="排序")
    private Integer sort;

    private static final long serialVersionUID = 1L;
}