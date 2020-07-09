package com.lhrsite.gmall.service;

import com.lhrsite.gmall.entity.SubjectProductRelation;
    /**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
public interface SubjectProductRelationService{


    int deleteByPrimaryKey(Long id);

    int insert(SubjectProductRelation record);

    int insertSelective(SubjectProductRelation record);

    SubjectProductRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SubjectProductRelation record);

    int updateByPrimaryKey(SubjectProductRelation record);

}
