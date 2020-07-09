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
    * 专题评论表
    */
@ApiModel(value="com-lhrsite-gmall-entity-TopicComment")
@Data
@Builder
public class TopicComment implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    @ApiModelProperty(value="")
    private String memberNickName;

    @ApiModelProperty(value="")
    private Long topicId;

    @ApiModelProperty(value="")
    private String memberIcon;

    @ApiModelProperty(value="")
    private String content;

    @ApiModelProperty(value="")
    private Date createTime;

    @ApiModelProperty(value="")
    private Integer showStatus;

    private static final long serialVersionUID = 1L;
}