package com.lhrsite.gmall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.lhrsite.gmall.mapper.RolePermissionRelationMapper;
import com.lhrsite.gmall.entity.RolePermissionRelation;
import com.lhrsite.gmall.service.RolePermissionRelationService;
/**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
@Service
public class RolePermissionRelationServiceImpl implements RolePermissionRelationService{

    @Resource
    private RolePermissionRelationMapper rolePermissionRelationMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return rolePermissionRelationMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(RolePermissionRelation record) {
        return rolePermissionRelationMapper.insert(record);
    }

    @Override
    public int insertSelective(RolePermissionRelation record) {
        return rolePermissionRelationMapper.insertSelective(record);
    }

    @Override
    public RolePermissionRelation selectByPrimaryKey(Long id) {
        return rolePermissionRelationMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(RolePermissionRelation record) {
        return rolePermissionRelationMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(RolePermissionRelation record) {
        return rolePermissionRelationMapper.updateByPrimaryKey(record);
    }

}
