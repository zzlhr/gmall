package com.lhrsite.gmall.service;

import com.lhrsite.gmall.entity.HomeNewProduct;
    /**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
public interface HomeNewProductService{


    int deleteByPrimaryKey(Long id);

    int insert(HomeNewProduct record);

    int insertSelective(HomeNewProduct record);

    HomeNewProduct selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(HomeNewProduct record);

    int updateByPrimaryKey(HomeNewProduct record);

}
