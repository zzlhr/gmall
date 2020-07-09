package com.lhrsite.gmall.service;

import com.lhrsite.gmall.entity.ProductAttributeCategory;
    /**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
public interface ProductAttributeCategoryService{


    int deleteByPrimaryKey(Long id);

    int insert(ProductAttributeCategory record);

    int insertSelective(ProductAttributeCategory record);

    ProductAttributeCategory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ProductAttributeCategory record);

    int updateByPrimaryKey(ProductAttributeCategory record);

}
