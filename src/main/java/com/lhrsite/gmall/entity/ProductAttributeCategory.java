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
    * 产品属性分类表
    */
@ApiModel(value="com-lhrsite-gmall-entity-ProductAttributeCategory")
@Data
@Builder
public class ProductAttributeCategory implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    @ApiModelProperty(value="")
    private String name;

    /**
    * 属性数量
    */
    @ApiModelProperty(value="属性数量")
    private Integer attributeCount;

    /**
    * 参数数量
    */
    @ApiModelProperty(value="参数数量")
    private Integer paramCount;

    private static final long serialVersionUID = 1L;
}