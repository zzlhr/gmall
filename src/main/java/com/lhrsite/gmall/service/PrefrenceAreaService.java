package com.lhrsite.gmall.service;

import com.lhrsite.gmall.entity.PrefrenceArea;
    /**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
public interface PrefrenceAreaService{


    int deleteByPrimaryKey(Long id);

    int insert(PrefrenceArea record);

    int insertSelective(PrefrenceArea record);

    PrefrenceArea selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PrefrenceArea record);

    int updateByPrimaryKey(PrefrenceArea record);

}
