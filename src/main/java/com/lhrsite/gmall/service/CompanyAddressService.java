package com.lhrsite.gmall.service;

import com.lhrsite.gmall.entity.CompanyAddress;
    /**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
public interface CompanyAddressService{


    int deleteByPrimaryKey(Long id);

    int insert(CompanyAddress record);

    int insertSelective(CompanyAddress record);

    CompanyAddress selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CompanyAddress record);

    int updateByPrimaryKey(CompanyAddress record);

}
