package com.lhrsite.gmall.service;

import com.lhrsite.gmall.entity.ProductOperateLog;
    /**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
public interface ProductOperateLogService{


    int deleteByPrimaryKey(Long id);

    int insert(ProductOperateLog record);

    int insertSelective(ProductOperateLog record);

    ProductOperateLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ProductOperateLog record);

    int updateByPrimaryKey(ProductOperateLog record);

}
