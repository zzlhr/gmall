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
    * 后台用户角色和权限关系表
    */
@ApiModel(value="com-lhrsite-gmall-entity-RolePermissionRelation")
@Data
@Builder
public class RolePermissionRelation implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    @ApiModelProperty(value="")
    private Long roleId;

    @ApiModelProperty(value="")
    private Long permissionId;

    private static final long serialVersionUID = 1L;
}