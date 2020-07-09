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
    * 商品审核记录
    */
@ApiModel(value="com-lhrsite-gmall-entity-ProductVertifyRecord")
@Data
@Builder
public class ProductVertifyRecord implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    @ApiModelProperty(value="")
    private Long productId;

    @ApiModelProperty(value="")
    private Date createTime;

    /**
    * 审核人
    */
    @ApiModelProperty(value="审核人")
    private String vertifyMan;

    @ApiModelProperty(value="")
    private Integer status;

    /**
    * 反馈详情
    */
    @ApiModelProperty(value="反馈详情")
    private String detail;

    private static final long serialVersionUID = 1L;
}