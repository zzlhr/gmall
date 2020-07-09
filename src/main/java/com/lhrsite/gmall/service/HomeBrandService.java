package com.lhrsite.gmall.service;

import com.lhrsite.gmall.entity.HomeBrand;
    /**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
public interface HomeBrandService{


    int deleteByPrimaryKey(Long id);

    int insert(HomeBrand record);

    int insertSelective(HomeBrand record);

    HomeBrand selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(HomeBrand record);

    int updateByPrimaryKey(HomeBrand record);

}
