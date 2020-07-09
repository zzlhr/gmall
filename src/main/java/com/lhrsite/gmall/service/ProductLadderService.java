package com.lhrsite.gmall.service;

import com.lhrsite.gmall.entity.ProductLadder;
    /**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
public interface ProductLadderService{


    int deleteByPrimaryKey(Long id);

    int insert(ProductLadder record);

    int insertSelective(ProductLadder record);

    ProductLadder selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ProductLadder record);

    int updateByPrimaryKey(ProductLadder record);

}
