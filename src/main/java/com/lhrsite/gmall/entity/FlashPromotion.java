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
    * 限时购表
    */
@ApiModel(value="com-lhrsite-gmall-entity-FlashPromotion")
@Data
@Builder
public class FlashPromotion implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    @ApiModelProperty(value="")
    private String title;

    /**
    * 开始日期
    */
    @ApiModelProperty(value="开始日期")
    private Date startDate;

    /**
    * 结束日期
    */
    @ApiModelProperty(value="结束日期")
    private Date endDate;

    /**
    * 上下线状态
    */
    @ApiModelProperty(value="上下线状态")
    private Integer status;

    /**
    * 秒杀时间段名称
    */
    @ApiModelProperty(value="秒杀时间段名称")
    private Date createTime;

    private static final long serialVersionUID = 1L;
}