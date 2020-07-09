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
    * 帮助分类表
    */
@ApiModel(value="com-lhrsite-gmall-entity-HelpCategory")
@Data
@Builder
public class HelpCategory implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    @ApiModelProperty(value="")
    private String name;

    /**
    * 分类图标
    */
    @ApiModelProperty(value="分类图标")
    private String icon;

    /**
    * 专题数量
    */
    @ApiModelProperty(value="专题数量")
    private Integer helpCount;

    @ApiModelProperty(value="")
    private Integer showStatus;

    @ApiModelProperty(value="")
    private Integer sort;

    private static final long serialVersionUID = 1L;
}