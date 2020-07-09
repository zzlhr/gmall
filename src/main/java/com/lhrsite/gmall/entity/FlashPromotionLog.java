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
    * 限时购通知记录
    */
@ApiModel(value="com-lhrsite-gmall-entity-FlashPromotionLog")
@Data
@Builder
public class FlashPromotionLog implements Serializable {
    @ApiModelProperty(value="")
    private Integer id;

    @ApiModelProperty(value="")
    private Integer memberId;

    @ApiModelProperty(value="")
    private Long productId;

    @ApiModelProperty(value="")
    private String memberPhone;

    @ApiModelProperty(value="")
    private String productName;

    /**
    * 会员订阅时间
    */
    @ApiModelProperty(value="会员订阅时间")
    private Date subscribeTime;

    @ApiModelProperty(value="")
    private Date sendTime;

    private static final long serialVersionUID = 1L;
}