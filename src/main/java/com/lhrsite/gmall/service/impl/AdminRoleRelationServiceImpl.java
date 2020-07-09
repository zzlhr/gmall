package com.lhrsite.gmall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.lhrsite.gmall.mapper.AdminRoleRelationMapper;
import com.lhrsite.gmall.entity.AdminRoleRelation;
import com.lhrsite.gmall.service.AdminRoleRelationService;
/**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
@Service
public class AdminRoleRelationServiceImpl implements AdminRoleRelationService{

    @Resource
    private AdminRoleRelationMapper adminRoleRelationMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return adminRoleRelationMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(AdminRoleRelation record) {
        return adminRoleRelationMapper.insert(record);
    }

    @Override
    public int insertSelective(AdminRoleRelation record) {
        return adminRoleRelationMapper.insertSelective(record);
    }

    @Override
    public AdminRoleRelation selectByPrimaryKey(Long id) {
        return adminRoleRelationMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(AdminRoleRelation record) {
        return adminRoleRelationMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(AdminRoleRelation record) {
        return adminRoleRelationMapper.updateByPrimaryKey(record);
    }

}
