package com.lhrsite.gmall.service;

import com.lhrsite.gmall.entity.Admin;

/**
 * Description
 *
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
public interface AdminService {


    int deleteByPrimaryKey(Long id);

    int insert(Admin record);

    int insertSelective(Admin record);

    Admin selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);

}
