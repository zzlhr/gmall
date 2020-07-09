package com.lhrsite.gmall.service;

import com.lhrsite.gmall.entity.MemberProductCategoryRelation;
    /**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
public interface MemberProductCategoryRelationService{


    int deleteByPrimaryKey(Long id);

    int insert(MemberProductCategoryRelation record);

    int insertSelective(MemberProductCategoryRelation record);

    MemberProductCategoryRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MemberProductCategoryRelation record);

    int updateByPrimaryKey(MemberProductCategoryRelation record);

}
