package com.lhrsite.gmall.service;

import com.lhrsite.gmall.entity.HomeRecommendProduct;
    /**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
public interface HomeRecommendProductService{


    int deleteByPrimaryKey(Long id);

    int insert(HomeRecommendProduct record);

    int insertSelective(HomeRecommendProduct record);

    HomeRecommendProduct selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(HomeRecommendProduct record);

    int updateByPrimaryKey(HomeRecommendProduct record);

}
