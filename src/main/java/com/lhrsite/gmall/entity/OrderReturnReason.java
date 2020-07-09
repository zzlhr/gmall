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
    * 退货原因表
    */
@ApiModel(value="com-lhrsite-gmall-entity-OrderReturnReason")
@Data
@Builder
public class OrderReturnReason implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    /**
    * 退货类型
    */
    @ApiModelProperty(value="退货类型")
    private String name;

    @ApiModelProperty(value="")
    private Integer sort;

    /**
    * 状态：0->不启用；1->启用
    */
    @ApiModelProperty(value="状态：0->不启用；1->启用")
    private Integer status;

    /**
    * 添加时间
    */
    @ApiModelProperty(value="添加时间")
    private Date createTime;

    private static final long serialVersionUID = 1L;
}