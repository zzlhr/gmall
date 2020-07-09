package com.lhrsite.gmall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.lhrsite.gmall.entity.HomeBrand;
import com.lhrsite.gmall.mapper.HomeBrandMapper;
import com.lhrsite.gmall.service.HomeBrandService;
/**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
@Service
public class HomeBrandServiceImpl implements HomeBrandService{

    @Resource
    private HomeBrandMapper homeBrandMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return homeBrandMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(HomeBrand record) {
        return homeBrandMapper.insert(record);
    }

    @Override
    public int insertSelective(HomeBrand record) {
        return homeBrandMapper.insertSelective(record);
    }

    @Override
    public HomeBrand selectByPrimaryKey(Long id) {
        return homeBrandMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(HomeBrand record) {
        return homeBrandMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(HomeBrand record) {
        return homeBrandMapper.updateByPrimaryKey(record);
    }

}
