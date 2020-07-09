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
    * 存储产品参数信息的表
    */
@ApiModel(value="com-lhrsite-gmall-entity-ProductAttributeValue")
@Data
@Builder
public class ProductAttributeValue implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    @ApiModelProperty(value="")
    private Long productId;

    @ApiModelProperty(value="")
    private Long productAttributeId;

    /**
    * 手动添加规格或参数的值，参数单值，规格有多个时以逗号隔开
    */
    @ApiModelProperty(value="手动添加规格或参数的值，参数单值，规格有多个时以逗号隔开")
    private String value;

    private static final long serialVersionUID = 1L;
}