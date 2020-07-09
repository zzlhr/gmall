package com.lhrsite.gmall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.lhrsite.gmall.entity.OrderSetting;
import com.lhrsite.gmall.mapper.OrderSettingMapper;
import com.lhrsite.gmall.service.OrderSettingService;
/**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
@Service
public class OrderSettingServiceImpl implements OrderSettingService{

    @Resource
    private OrderSettingMapper orderSettingMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return orderSettingMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(OrderSetting record) {
        return orderSettingMapper.insert(record);
    }

    @Override
    public int insertSelective(OrderSetting record) {
        return orderSettingMapper.insertSelective(record);
    }

    @Override
    public OrderSetting selectByPrimaryKey(Long id) {
        return orderSettingMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(OrderSetting record) {
        return orderSettingMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(OrderSetting record) {
        return orderSettingMapper.updateByPrimaryKey(record);
    }

}
