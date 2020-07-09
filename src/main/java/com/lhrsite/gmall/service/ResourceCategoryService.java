package com.lhrsite.gmall.service;

import com.lhrsite.gmall.entity.ResourceCategory;
    /**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
public interface ResourceCategoryService{


    int deleteByPrimaryKey(Long id);

    int insert(ResourceCategory record);

    int insertSelective(ResourceCategory record);

    ResourceCategory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ResourceCategory record);

    int updateByPrimaryKey(ResourceCategory record);

}
