package com.lhrsite.gmall.service;

import com.lhrsite.gmall.entity.ProductCategoryAttributeRelation;
    /**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
public interface ProductCategoryAttributeRelationService{


    int deleteByPrimaryKey(Long id);

    int insert(ProductCategoryAttributeRelation record);

    int insertSelective(ProductCategoryAttributeRelation record);

    ProductCategoryAttributeRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ProductCategoryAttributeRelation record);

    int updateByPrimaryKey(ProductCategoryAttributeRelation record);

}
