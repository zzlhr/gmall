package com.lhrsite.gmall.service;

import com.lhrsite.gmall.entity.ProductAttributeValue;
    /**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
public interface ProductAttributeValueService{


    int deleteByPrimaryKey(Long id);

    int insert(ProductAttributeValue record);

    int insertSelective(ProductAttributeValue record);

    ProductAttributeValue selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ProductAttributeValue record);

    int updateByPrimaryKey(ProductAttributeValue record);

}
