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
    * 产品满减表(只针对同商品)
    */
@ApiModel(value="com-lhrsite-gmall-entity-ProductFullReduction")
@Data
@Builder
public class ProductFullReduction implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    @ApiModelProperty(value="")
    private Long productId;

    @ApiModelProperty(value="")
    private BigDecimal fullPrice;

    @ApiModelProperty(value="")
    private BigDecimal reducePrice;

    private static final long serialVersionUID = 1L;
}