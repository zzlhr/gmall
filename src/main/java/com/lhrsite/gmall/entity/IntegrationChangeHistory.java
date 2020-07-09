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
    * 积分变化历史记录表
    */
@ApiModel(value="com-lhrsite-gmall-entity-IntegrationChangeHistory")
@Data
@Builder
public class IntegrationChangeHistory implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    @ApiModelProperty(value="")
    private Long memberId;

    @ApiModelProperty(value="")
    private Date createTime;

    /**
    * 改变类型：0->增加；1->减少
    */
    @ApiModelProperty(value="改变类型：0->增加；1->减少")
    private Integer changeType;

    /**
    * 积分改变数量
    */
    @ApiModelProperty(value="积分改变数量")
    private Integer changeCount;

    /**
    * 操作人员
    */
    @ApiModelProperty(value="操作人员")
    private String operateMan;

    /**
    * 操作备注
    */
    @ApiModelProperty(value="操作备注")
    private String operateNote;

    /**
    * 积分来源：0->购物；1->管理员修改
    */
    @ApiModelProperty(value="积分来源：0->购物；1->管理员修改")
    private Integer sourceType;

    private static final long serialVersionUID = 1L;
}