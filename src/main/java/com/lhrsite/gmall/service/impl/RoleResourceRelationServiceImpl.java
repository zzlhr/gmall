package com.lhrsite.gmall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.lhrsite.gmall.entity.RoleResourceRelation;
import com.lhrsite.gmall.mapper.RoleResourceRelationMapper;
import com.lhrsite.gmall.service.RoleResourceRelationService;
/**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
@Service
public class RoleResourceRelationServiceImpl implements RoleResourceRelationService{

    @Resource
    private RoleResourceRelationMapper roleResourceRelationMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return roleResourceRelationMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(RoleResourceRelation record) {
        return roleResourceRelationMapper.insert(record);
    }

    @Override
    public int insertSelective(RoleResourceRelation record) {
        return roleResourceRelationMapper.insertSelective(record);
    }

    @Override
    public RoleResourceRelation selectByPrimaryKey(Long id) {
        return roleResourceRelationMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(RoleResourceRelation record) {
        return roleResourceRelationMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(RoleResourceRelation record) {
        return roleResourceRelationMapper.updateByPrimaryKey(record);
    }

}
