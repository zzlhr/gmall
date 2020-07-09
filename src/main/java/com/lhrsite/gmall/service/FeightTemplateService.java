package com.lhrsite.gmall.service;

import com.lhrsite.gmall.entity.FeightTemplate;
    /**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
public interface FeightTemplateService{


    int deleteByPrimaryKey(Long id);

    int insert(FeightTemplate record);

    int insertSelective(FeightTemplate record);

    FeightTemplate selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(FeightTemplate record);

    int updateByPrimaryKey(FeightTemplate record);

}
