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
    * 产品的分类和属性的关系表，用于设置分类筛选条件（只支持一级分类）
    */
@ApiModel(value="com-lhrsite-gmall-entity-ProductCategoryAttributeRelation")
@Data
@Builder
public class ProductCategoryAttributeRelation implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    @ApiModelProperty(value="")
    private Long productCategoryId;

    @ApiModelProperty(value="")
    private Long productAttributeId;

    private static final long serialVersionUID = 1L;
}