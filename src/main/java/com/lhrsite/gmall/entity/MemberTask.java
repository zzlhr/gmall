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
    * 会员任务表
    */
@ApiModel(value="com-lhrsite-gmall-entity-MemberTask")
@Data
@Builder
public class MemberTask implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    @ApiModelProperty(value="")
    private String name;

    /**
    * 赠送成长值
    */
    @ApiModelProperty(value="赠送成长值")
    private Integer growth;

    /**
    * 赠送积分
    */
    @ApiModelProperty(value="赠送积分")
    private Integer intergration;

    /**
    * 任务类型：0->新手任务；1->日常任务
    */
    @ApiModelProperty(value="任务类型：0->新手任务；1->日常任务")
    private Integer type;

    private static final long serialVersionUID = 1L;
}