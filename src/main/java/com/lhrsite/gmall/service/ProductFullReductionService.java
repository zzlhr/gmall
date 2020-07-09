package com.lhrsite.gmall.service;

import com.lhrsite.gmall.entity.ProductFullReduction;
    /**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
public interface ProductFullReductionService{


    int deleteByPrimaryKey(Long id);

    int insert(ProductFullReduction record);

    int insertSelective(ProductFullReduction record);

    ProductFullReduction selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ProductFullReduction record);

    int updateByPrimaryKey(ProductFullReduction record);

}
