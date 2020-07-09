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
    * 相册表
    */
@ApiModel(value="com-lhrsite-gmall-entity-Album")
@Data
@Builder
public class Album implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    @ApiModelProperty(value="")
    private String name;

    @ApiModelProperty(value="")
    private String coverPic;

    @ApiModelProperty(value="")
    private Integer picCount;

    @ApiModelProperty(value="")
    private Integer sort;

    @ApiModelProperty(value="")
    private String description;

    private static final long serialVersionUID = 1L;
}