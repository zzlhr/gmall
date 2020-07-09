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
    * 优选专区
    */
@ApiModel(value="com-lhrsite-gmall-entity-PrefrenceArea")
@Data
@Builder
public class PrefrenceArea implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    @ApiModelProperty(value="")
    private String name;

    @ApiModelProperty(value="")
    private String subTitle;

    /**
    * 展示图片
    */
    @ApiModelProperty(value="展示图片")
    private byte[] pic;

    @ApiModelProperty(value="")
    private Integer sort;

    @ApiModelProperty(value="")
    private Integer showStatus;

    private static final long serialVersionUID = 1L;
}