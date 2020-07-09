package com.lhrsite.gmall.service;

import com.lhrsite.gmall.entity.AdminRoleRelation;
    /**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
public interface AdminRoleRelationService{


    int deleteByPrimaryKey(Long id);

    int insert(AdminRoleRelation record);

    int insertSelective(AdminRoleRelation record);

    AdminRoleRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AdminRoleRelation record);

    int updateByPrimaryKey(AdminRoleRelation record);

}
