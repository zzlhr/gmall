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
    * 会员与产品分类关系表（用户喜欢的分类）
    */
@ApiModel(value="com-lhrsite-gmall-entity-MemberProductCategoryRelation")
@Data
@Builder
public class MemberProductCategoryRelation implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    @ApiModelProperty(value="")
    private Long memberId;

    @ApiModelProperty(value="")
    private Long productCategoryId;

    private static final long serialVersionUID = 1L;
}