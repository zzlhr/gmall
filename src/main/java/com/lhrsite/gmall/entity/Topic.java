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
    * 话题表
    */
@ApiModel(value="com-lhrsite-gmall-entity-Topic")
@Data
@Builder
public class Topic implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    @ApiModelProperty(value="")
    private Long categoryId;

    @ApiModelProperty(value="")
    private String name;

    @ApiModelProperty(value="")
    private Date createTime;

    @ApiModelProperty(value="")
    private Date startTime;

    @ApiModelProperty(value="")
    private Date endTime;

    /**
    * 参与人数
    */
    @ApiModelProperty(value="参与人数")
    private Integer attendCount;

    /**
    * 关注人数
    */
    @ApiModelProperty(value="关注人数")
    private Integer attentionCount;

    @ApiModelProperty(value="")
    private Integer readCount;

    /**
    * 奖品名称
    */
    @ApiModelProperty(value="奖品名称")
    private String awardName;

    /**
    * 参与方式
    */
    @ApiModelProperty(value="参与方式")
    private String attendType;

    /**
    * 话题内容
    */
    @ApiModelProperty(value="话题内容")
    private String content;

    private static final long serialVersionUID = 1L;
}