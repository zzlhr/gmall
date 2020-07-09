package com.lhrsite.gmall.service;

import com.lhrsite.gmall.entity.IntegrationConsumeSetting;
    /**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
public interface IntegrationConsumeSettingService{


    int deleteByPrimaryKey(Long id);

    int insert(IntegrationConsumeSetting record);

    int insertSelective(IntegrationConsumeSetting record);

    IntegrationConsumeSetting selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(IntegrationConsumeSetting record);

    int updateByPrimaryKey(IntegrationConsumeSetting record);

}
