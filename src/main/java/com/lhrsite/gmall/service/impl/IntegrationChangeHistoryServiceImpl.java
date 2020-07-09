package com.lhrsite.gmall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.lhrsite.gmall.entity.IntegrationChangeHistory;
import com.lhrsite.gmall.mapper.IntegrationChangeHistoryMapper;
import com.lhrsite.gmall.service.IntegrationChangeHistoryService;
/**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
@Service
public class IntegrationChangeHistoryServiceImpl implements IntegrationChangeHistoryService{

    @Resource
    private IntegrationChangeHistoryMapper integrationChangeHistoryMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return integrationChangeHistoryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(IntegrationChangeHistory record) {
        return integrationChangeHistoryMapper.insert(record);
    }

    @Override
    public int insertSelective(IntegrationChangeHistory record) {
        return integrationChangeHistoryMapper.insertSelective(record);
    }

    @Override
    public IntegrationChangeHistory selectByPrimaryKey(Long id) {
        return integrationChangeHistoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(IntegrationChangeHistory record) {
        return integrationChangeHistoryMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(IntegrationChangeHistory record) {
        return integrationChangeHistoryMapper.updateByPrimaryKey(record);
    }

}
