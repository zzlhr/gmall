package com.lhrsite.gmall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.lhrsite.gmall.mapper.OrderOperateHistoryMapper;
import com.lhrsite.gmall.entity.OrderOperateHistory;
import com.lhrsite.gmall.service.OrderOperateHistoryService;
/**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
@Service
public class OrderOperateHistoryServiceImpl implements OrderOperateHistoryService{

    @Resource
    private OrderOperateHistoryMapper orderOperateHistoryMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return orderOperateHistoryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(OrderOperateHistory record) {
        return orderOperateHistoryMapper.insert(record);
    }

    @Override
    public int insertSelective(OrderOperateHistory record) {
        return orderOperateHistoryMapper.insertSelective(record);
    }

    @Override
    public OrderOperateHistory selectByPrimaryKey(Long id) {
        return orderOperateHistoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(OrderOperateHistory record) {
        return orderOperateHistoryMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(OrderOperateHistory record) {
        return orderOperateHistoryMapper.updateByPrimaryKey(record);
    }

}
