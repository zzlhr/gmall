package com.lhrsite.gmall.service;

import com.lhrsite.gmall.entity.AdminPermissionRelation;
    /**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
public interface AdminPermissionRelationService{


    int deleteByPrimaryKey(Long id);

    int insert(AdminPermissionRelation record);

    int insertSelective(AdminPermissionRelation record);

    AdminPermissionRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AdminPermissionRelation record);

    int updateByPrimaryKey(AdminPermissionRelation record);

}
