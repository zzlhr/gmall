package com.lhrsite.gmall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.lhrsite.gmall.entity.CouponHistory;
import com.lhrsite.gmall.mapper.CouponHistoryMapper;
import com.lhrsite.gmall.service.CouponHistoryService;
/**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
@Service
public class CouponHistoryServiceImpl implements CouponHistoryService{

    @Resource
    private CouponHistoryMapper couponHistoryMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return couponHistoryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(CouponHistory record) {
        return couponHistoryMapper.insert(record);
    }

    @Override
    public int insertSelective(CouponHistory record) {
        return couponHistoryMapper.insertSelective(record);
    }

    @Override
    public CouponHistory selectByPrimaryKey(Long id) {
        return couponHistoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(CouponHistory record) {
        return couponHistoryMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(CouponHistory record) {
        return couponHistoryMapper.updateByPrimaryKey(record);
    }

}
