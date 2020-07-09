package com.lhrsite.gmall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.lhrsite.gmall.entity.CompanyAddress;
import com.lhrsite.gmall.mapper.CompanyAddressMapper;
import com.lhrsite.gmall.service.CompanyAddressService;
/**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
@Service
public class CompanyAddressServiceImpl implements CompanyAddressService{

    @Resource
    private CompanyAddressMapper companyAddressMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return companyAddressMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(CompanyAddress record) {
        return companyAddressMapper.insert(record);
    }

    @Override
    public int insertSelective(CompanyAddress record) {
        return companyAddressMapper.insertSelective(record);
    }

    @Override
    public CompanyAddress selectByPrimaryKey(Long id) {
        return companyAddressMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(CompanyAddress record) {
        return companyAddressMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(CompanyAddress record) {
        return companyAddressMapper.updateByPrimaryKey(record);
    }

}
