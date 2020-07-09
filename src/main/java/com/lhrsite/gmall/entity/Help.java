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
    * 帮助表
    */
@ApiModel(value="com-lhrsite-gmall-entity-Help")
@Data
@Builder
public class Help implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    @ApiModelProperty(value="")
    private Long categoryId;

    @ApiModelProperty(value="")
    private String icon;

    @ApiModelProperty(value="")
    private String title;

    @ApiModelProperty(value="")
    private Integer showStatus;

    @ApiModelProperty(value="")
    private Date createTime;

    @ApiModelProperty(value="")
    private Integer readCount;

    @ApiModelProperty(value="")
    private String content;

    private static final long serialVersionUID = 1L;
}