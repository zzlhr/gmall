package com.lhrsite.gmall.service;

import com.lhrsite.gmall.entity.ProductVertifyRecord;
    /**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
public interface ProductVertifyRecordService{


    int deleteByPrimaryKey(Long id);

    int insert(ProductVertifyRecord record);

    int insertSelective(ProductVertifyRecord record);

    ProductVertifyRecord selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ProductVertifyRecord record);

    int updateByPrimaryKey(ProductVertifyRecord record);

}
