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
    * 优选专区和产品关系表
    */
@ApiModel(value="com-lhrsite-gmall-entity-PrefrenceAreaProductRelation")
@Data
@Builder
public class PrefrenceAreaProductRelation implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    @ApiModelProperty(value="")
    private Long prefrenceAreaId;

    @ApiModelProperty(value="")
    private Long productId;

    private static final long serialVersionUID = 1L;
}