package com.lhrsite.gmall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.lhrsite.gmall.entity.CouponProductRelation;
import com.lhrsite.gmall.mapper.CouponProductRelationMapper;
import com.lhrsite.gmall.service.CouponProductRelationService;
/**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
@Service
public class CouponProductRelationServiceImpl implements CouponProductRelationService{

    @Resource
    private CouponProductRelationMapper couponProductRelationMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return couponProductRelationMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(CouponProductRelation record) {
        return couponProductRelationMapper.insert(record);
    }

    @Override
    public int insertSelective(CouponProductRelation record) {
        return couponProductRelationMapper.insertSelective(record);
    }

    @Override
    public CouponProductRelation selectByPrimaryKey(Long id) {
        return couponProductRelationMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(CouponProductRelation record) {
        return couponProductRelationMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(CouponProductRelation record) {
        return couponProductRelationMapper.updateByPrimaryKey(record);
    }

}
