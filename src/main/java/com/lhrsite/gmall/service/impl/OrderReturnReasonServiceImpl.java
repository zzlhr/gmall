package com.lhrsite.gmall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.lhrsite.gmall.entity.OrderReturnReason;
import com.lhrsite.gmall.mapper.OrderReturnReasonMapper;
import com.lhrsite.gmall.service.OrderReturnReasonService;
/**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
@Service
public class OrderReturnReasonServiceImpl implements OrderReturnReasonService{

    @Resource
    private OrderReturnReasonMapper orderReturnReasonMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return orderReturnReasonMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(OrderReturnReason record) {
        return orderReturnReasonMapper.insert(record);
    }

    @Override
    public int insertSelective(OrderReturnReason record) {
        return orderReturnReasonMapper.insertSelective(record);
    }

    @Override
    public OrderReturnReason selectByPrimaryKey(Long id) {
        return orderReturnReasonMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(OrderReturnReason record) {
        return orderReturnReasonMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(OrderReturnReason record) {
        return orderReturnReasonMapper.updateByPrimaryKey(record);
    }

}
