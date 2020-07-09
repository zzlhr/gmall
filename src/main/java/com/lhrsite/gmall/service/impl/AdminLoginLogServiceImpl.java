package com.lhrsite.gmall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.lhrsite.gmall.entity.AdminLoginLog;
import com.lhrsite.gmall.mapper.AdminLoginLogMapper;
import com.lhrsite.gmall.service.AdminLoginLogService;
/**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
@Service
public class AdminLoginLogServiceImpl implements AdminLoginLogService{

    @Resource
    private AdminLoginLogMapper adminLoginLogMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return adminLoginLogMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(AdminLoginLog record) {
        return adminLoginLogMapper.insert(record);
    }

    @Override
    public int insertSelective(AdminLoginLog record) {
        return adminLoginLogMapper.insertSelective(record);
    }

    @Override
    public AdminLoginLog selectByPrimaryKey(Long id) {
        return adminLoginLogMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(AdminLoginLog record) {
        return adminLoginLogMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(AdminLoginLog record) {
        return adminLoginLogMapper.updateByPrimaryKey(record);
    }

}
