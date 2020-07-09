package com.lhrsite.gmall.service;

import com.lhrsite.gmall.entity.HomeRecommendSubject;
    /**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
public interface HomeRecommendSubjectService{


    int deleteByPrimaryKey(Long id);

    int insert(HomeRecommendSubject record);

    int insertSelective(HomeRecommendSubject record);

    HomeRecommendSubject selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(HomeRecommendSubject record);

    int updateByPrimaryKey(HomeRecommendSubject record);

}
