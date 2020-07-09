package com.lhrsite.gmall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.lhrsite.gmall.mapper.GrowthChangeHistoryMapper;
import com.lhrsite.gmall.entity.GrowthChangeHistory;
import com.lhrsite.gmall.service.GrowthChangeHistoryService;
/**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
@Service
public class GrowthChangeHistoryServiceImpl implements GrowthChangeHistoryService{

    @Resource
    private GrowthChangeHistoryMapper growthChangeHistoryMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return growthChangeHistoryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(GrowthChangeHistory record) {
        return growthChangeHistoryMapper.insert(record);
    }

    @Override
    public int insertSelective(GrowthChangeHistory record) {
        return growthChangeHistoryMapper.insertSelective(record);
    }

    @Override
    public GrowthChangeHistory selectByPrimaryKey(Long id) {
        return growthChangeHistoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(GrowthChangeHistory record) {
        return growthChangeHistoryMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(GrowthChangeHistory record) {
        return growthChangeHistoryMapper.updateByPrimaryKey(record);
    }

}
