package com.lhrsite.gmall.service.impl;

import com.lhrsite.gmall.entity.Admin;
import com.lhrsite.gmall.mapper.AdminMapper;
import com.lhrsite.gmall.service.AdminService;
import com.lhrsite.gmall.vo.AdminDetailVO;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Description
 *
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
@Service
public class AdminServiceImpl implements AdminService, UserDetailsService {

    @Resource
    private AdminMapper adminMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return adminMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Admin record) {
        return adminMapper.insert(record);
    }

    @Override
    public int insertSelective(Admin record) {
        return adminMapper.insertSelective(record);
    }

    @Override
    public Admin selectByPrimaryKey(Long id) {
        return adminMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Admin record) {
        return adminMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Admin record) {
        return adminMapper.updateByPrimaryKey(record);
    }

    @Override
    public AdminDetailVO loadUserByUsername(String username) throws UsernameNotFoundException {
        AdminDetailVO adminDetailVO = adminMapper.selectByUsername(username);

        return
    }
}
