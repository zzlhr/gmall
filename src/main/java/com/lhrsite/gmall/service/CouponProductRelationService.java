package com.lhrsite.gmall.service;

import com.lhrsite.gmall.entity.CouponProductRelation;
    /**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
public interface CouponProductRelationService{


    int deleteByPrimaryKey(Long id);

    int insert(CouponProductRelation record);

    int insertSelective(CouponProductRelation record);

    CouponProductRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CouponProductRelation record);

    int updateByPrimaryKey(CouponProductRelation record);

}
