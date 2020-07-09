package com.lhrsite.gmall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.lhrsite.gmall.entity.CouponProductCategoryRelation;
import com.lhrsite.gmall.mapper.CouponProductCategoryRelationMapper;
import com.lhrsite.gmall.service.CouponProductCategoryRelationService;
/**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
@Service
public class CouponProductCategoryRelationServiceImpl implements CouponProductCategoryRelationService{

    @Resource
    private CouponProductCategoryRelationMapper couponProductCategoryRelationMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return couponProductCategoryRelationMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(CouponProductCategoryRelation record) {
        return couponProductCategoryRelationMapper.insert(record);
    }

    @Override
    public int insertSelective(CouponProductCategoryRelation record) {
        return couponProductCategoryRelationMapper.insertSelective(record);
    }

    @Override
    public CouponProductCategoryRelation selectByPrimaryKey(Long id) {
        return couponProductCategoryRelationMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(CouponProductCategoryRelation record) {
        return couponProductCategoryRelationMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(CouponProductCategoryRelation record) {
        return couponProductCategoryRelationMapper.updateByPrimaryKey(record);
    }

}
