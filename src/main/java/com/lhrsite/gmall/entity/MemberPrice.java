package com.lhrsite.gmall.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Builder;
import lombok.Data;

/**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
/**
    * 商品会员价格表
    */
@ApiModel(value="com-lhrsite-gmall-entity-MemberPrice")
@Data
@Builder
public class MemberPrice implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    @ApiModelProperty(value="")
    private Long productId;

    @ApiModelProperty(value="")
    private Long memberLevelId;

    /**
    * 会员价格
    */
    @ApiModelProperty(value="会员价格")
    private BigDecimal memberPrice;

    @ApiModelProperty(value="")
    private String memberLevelName;

    private static final long serialVersionUID = 1L;
}