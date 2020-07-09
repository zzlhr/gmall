package com.lhrsite.gmall.service;

import com.lhrsite.gmall.entity.CouponProductCategoryRelation;
    /**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
public interface CouponProductCategoryRelationService{


    int deleteByPrimaryKey(Long id);

    int insert(CouponProductCategoryRelation record);

    int insertSelective(CouponProductCategoryRelation record);

    CouponProductCategoryRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CouponProductCategoryRelation record);

    int updateByPrimaryKey(CouponProductCategoryRelation record);

}
