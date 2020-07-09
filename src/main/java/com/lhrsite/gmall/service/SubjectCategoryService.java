package com.lhrsite.gmall.service;

import com.lhrsite.gmall.entity.SubjectCategory;
    /**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
public interface SubjectCategoryService{


    int deleteByPrimaryKey(Long id);

    int insert(SubjectCategory record);

    int insertSelective(SubjectCategory record);

    SubjectCategory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SubjectCategory record);

    int updateByPrimaryKey(SubjectCategory record);

}
