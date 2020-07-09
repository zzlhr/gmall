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
    * 后台用户和权限关系表(除角色中定义的权限以外的加减权限)
    */
@ApiModel(value="com-lhrsite-gmall-entity-AdminPermissionRelation")
@Data
@Builder
public class AdminPermissionRelation implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    @ApiModelProperty(value="")
    private Long adminId;

    @ApiModelProperty(value="")
    private Long permissionId;

    @ApiModelProperty(value="")
    private Integer type;

    private static final long serialVersionUID = 1L;
}