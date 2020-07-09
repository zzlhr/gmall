package com.lhrsite.gmall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.lhrsite.gmall.mapper.HomeNewProductMapper;
import com.lhrsite.gmall.entity.HomeNewProduct;
import com.lhrsite.gmall.service.HomeNewProductService;
/**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
@Service
public class HomeNewProductServiceImpl implements HomeNewProductService{

    @Resource
    private HomeNewProductMapper homeNewProductMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return homeNewProductMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(HomeNewProduct record) {
        return homeNewProductMapper.insert(record);
    }

    @Override
    public int insertSelective(HomeNewProduct record) {
        return homeNewProductMapper.insertSelective(record);
    }

    @Override
    public HomeNewProduct selectByPrimaryKey(Long id) {
        return homeNewProductMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(HomeNewProduct record) {
        return homeNewProductMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(HomeNewProduct record) {
        return homeNewProductMapper.updateByPrimaryKey(record);
    }

}
