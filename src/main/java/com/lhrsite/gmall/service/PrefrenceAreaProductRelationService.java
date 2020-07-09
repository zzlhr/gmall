package com.lhrsite.gmall.service;

import com.lhrsite.gmall.entity.PrefrenceAreaProductRelation;
    /**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
public interface PrefrenceAreaProductRelationService{


    int deleteByPrimaryKey(Long id);

    int insert(PrefrenceAreaProductRelation record);

    int insertSelective(PrefrenceAreaProductRelation record);

    PrefrenceAreaProductRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PrefrenceAreaProductRelation record);

    int updateByPrimaryKey(PrefrenceAreaProductRelation record);

}
