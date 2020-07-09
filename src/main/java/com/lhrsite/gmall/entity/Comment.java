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
    * 商品评价表
    */
@ApiModel(value="com-lhrsite-gmall-entity-Comment")
@Data
@Builder
public class Comment implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    @ApiModelProperty(value="")
    private Long productId;

    @ApiModelProperty(value="")
    private String memberNickName;

    @ApiModelProperty(value="")
    private String productName;

    /**
    * 评价星数：0->5
    */
    @ApiModelProperty(value="评价星数：0->5")
    private Integer star;

    /**
    * 评价的ip
    */
    @ApiModelProperty(value="评价的ip")
    private String memberIp;

    @ApiModelProperty(value="")
    private Date createTime;

    @ApiModelProperty(value="")
    private Integer showStatus;

    /**
    * 购买时的商品属性
    */
    @ApiModelProperty(value="购买时的商品属性")
    private String productAttribute;

    @ApiModelProperty(value="")
    private Integer collectCouont;

    @ApiModelProperty(value="")
    private Integer readCount;

    @ApiModelProperty(value="")
    private String content;

    /**
    * 上传图片地址，以逗号隔开
    */
    @ApiModelProperty(value="上传图片地址，以逗号隔开")
    private String pics;

    /**
    * 评论用户头像
    */
    @ApiModelProperty(value="评论用户头像")
    private String memberIcon;

    @ApiModelProperty(value="")
    private Integer replayCount;

    private static final long serialVersionUID = 1L;
}