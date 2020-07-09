package com.lhrsite.gmall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.lhrsite.gmall.mapper.RoleMenuRelationMapper;
import com.lhrsite.gmall.entity.RoleMenuRelation;
import com.lhrsite.gmall.service.RoleMenuRelationService;
/**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
@Service
public class RoleMenuRelationServiceImpl implements RoleMenuRelationService{

    @Resource
    private RoleMenuRelationMapper roleMenuRelationMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return roleMenuRelationMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(RoleMenuRelation record) {
        return roleMenuRelationMapper.insert(record);
    }

    @Override
    public int insertSelective(RoleMenuRelation record) {
        return roleMenuRelationMapper.insertSelective(record);
    }

    @Override
    public RoleMenuRelation selectByPrimaryKey(Long id) {
        return roleMenuRelationMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(RoleMenuRelation record) {
        return roleMenuRelationMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(RoleMenuRelation record) {
        return roleMenuRelationMapper.updateByPrimaryKey(record);
    }

}
