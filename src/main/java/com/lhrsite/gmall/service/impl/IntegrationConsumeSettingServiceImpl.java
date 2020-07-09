package com.lhrsite.gmall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.lhrsite.gmall.entity.IntegrationConsumeSetting;
import com.lhrsite.gmall.mapper.IntegrationConsumeSettingMapper;
import com.lhrsite.gmall.service.IntegrationConsumeSettingService;
/**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
@Service
public class IntegrationConsumeSettingServiceImpl implements IntegrationConsumeSettingService{

    @Resource
    private IntegrationConsumeSettingMapper integrationConsumeSettingMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return integrationConsumeSettingMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(IntegrationConsumeSetting record) {
        return integrationConsumeSettingMapper.insert(record);
    }

    @Override
    public int insertSelective(IntegrationConsumeSetting record) {
        return integrationConsumeSettingMapper.insertSelective(record);
    }

    @Override
    public IntegrationConsumeSetting selectByPrimaryKey(Long id) {
        return integrationConsumeSettingMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(IntegrationConsumeSetting record) {
        return integrationConsumeSettingMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(IntegrationConsumeSetting record) {
        return integrationConsumeSettingMapper.updateByPrimaryKey(record);
    }

}
