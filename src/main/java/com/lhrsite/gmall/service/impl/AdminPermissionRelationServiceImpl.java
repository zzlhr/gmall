package com.lhrsite.gmall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.lhrsite.gmall.mapper.AdminPermissionRelationMapper;
import com.lhrsite.gmall.entity.AdminPermissionRelation;
import com.lhrsite.gmall.service.AdminPermissionRelationService;
/**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
@Service
public class AdminPermissionRelationServiceImpl implements AdminPermissionRelationService{

    @Resource
    private AdminPermissionRelationMapper adminPermissionRelationMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return adminPermissionRelationMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(AdminPermissionRelation record) {
        return adminPermissionRelationMapper.insert(record);
    }

    @Override
    public int insertSelective(AdminPermissionRelation record) {
        return adminPermissionRelationMapper.insertSelective(record);
    }

    @Override
    public AdminPermissionRelation selectByPrimaryKey(Long id) {
        return adminPermissionRelationMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(AdminPermissionRelation record) {
        return adminPermissionRelationMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(AdminPermissionRelation record) {
        return adminPermissionRelationMapper.updateByPrimaryKey(record);
    }

}
