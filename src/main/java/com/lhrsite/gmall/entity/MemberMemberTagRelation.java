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
    * 用户和标签关系表
    */
@ApiModel(value="com-lhrsite-gmall-entity-MemberMemberTagRelation")
@Data
@Builder
public class MemberMemberTagRelation implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    @ApiModelProperty(value="")
    private Long memberId;

    @ApiModelProperty(value="")
    private Long tagId;

    private static final long serialVersionUID = 1L;
}