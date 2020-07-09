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
    * 画册图片表
    */
@ApiModel(value="com-lhrsite-gmall-entity-AlbumPic")
@Data
@Builder
public class AlbumPic implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    @ApiModelProperty(value="")
    private Long albumId;

    @ApiModelProperty(value="")
    private String pic;

    private static final long serialVersionUID = 1L;
}