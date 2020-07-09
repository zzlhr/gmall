package com.lhrsite.gmall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.lhrsite.gmall.mapper.HomeRecommendProductMapper;
import com.lhrsite.gmall.entity.HomeRecommendProduct;
import com.lhrsite.gmall.service.HomeRecommendProductService;
/**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
@Service
public class HomeRecommendProductServiceImpl implements HomeRecommendProductService{

    @Resource
    private HomeRecommendProductMapper homeRecommendProductMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return homeRecommendProductMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(HomeRecommendProduct record) {
        return homeRecommendProductMapper.insert(record);
    }

    @Override
    public int insertSelective(HomeRecommendProduct record) {
        return homeRecommendProductMapper.insertSelective(record);
    }

    @Override
    public HomeRecommendProduct selectByPrimaryKey(Long id) {
        return homeRecommendProductMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(HomeRecommendProduct record) {
        return homeRecommendProductMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(HomeRecommendProduct record) {
        return homeRecommendProductMapper.updateByPrimaryKey(record);
    }

}
