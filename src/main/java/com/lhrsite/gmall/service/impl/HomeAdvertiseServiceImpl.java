package com.lhrsite.gmall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.lhrsite.gmall.entity.HomeAdvertise;
import com.lhrsite.gmall.mapper.HomeAdvertiseMapper;
import com.lhrsite.gmall.service.HomeAdvertiseService;
/**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
@Service
public class HomeAdvertiseServiceImpl implements HomeAdvertiseService{

    @Resource
    private HomeAdvertiseMapper homeAdvertiseMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return homeAdvertiseMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(HomeAdvertise record) {
        return homeAdvertiseMapper.insert(record);
    }

    @Override
    public int insertSelective(HomeAdvertise record) {
        return homeAdvertiseMapper.insertSelective(record);
    }

    @Override
    public HomeAdvertise selectByPrimaryKey(Long id) {
        return homeAdvertiseMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(HomeAdvertise record) {
        return homeAdvertiseMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(HomeAdvertise record) {
        return homeAdvertiseMapper.updateByPrimaryKey(record);
    }

}
