package com.lhrsite.gmall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.lhrsite.gmall.entity.OrderReturnApply;
import com.lhrsite.gmall.mapper.OrderReturnApplyMapper;
import com.lhrsite.gmall.service.OrderReturnApplyService;
/**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
@Service
public class OrderReturnApplyServiceImpl implements OrderReturnApplyService{

    @Resource
    private OrderReturnApplyMapper orderReturnApplyMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return orderReturnApplyMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(OrderReturnApply record) {
        return orderReturnApplyMapper.insert(record);
    }

    @Override
    public int insertSelective(OrderReturnApply record) {
        return orderReturnApplyMapper.insertSelective(record);
    }

    @Override
    public OrderReturnApply selectByPrimaryKey(Long id) {
        return orderReturnApplyMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(OrderReturnApply record) {
        return orderReturnApplyMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(OrderReturnApply record) {
        return orderReturnApplyMapper.updateByPrimaryKey(record);
    }

}
