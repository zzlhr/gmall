package com.lhrsite.gmall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.lhrsite.gmall.mapper.FlashPromotionLogMapper;
import com.lhrsite.gmall.entity.FlashPromotionLog;
import com.lhrsite.gmall.service.FlashPromotionLogService;
/**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
@Service
public class FlashPromotionLogServiceImpl implements FlashPromotionLogService{

    @Resource
    private FlashPromotionLogMapper flashPromotionLogMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return flashPromotionLogMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(FlashPromotionLog record) {
        return flashPromotionLogMapper.insert(record);
    }

    @Override
    public int insertSelective(FlashPromotionLog record) {
        return flashPromotionLogMapper.insertSelective(record);
    }

    @Override
    public FlashPromotionLog selectByPrimaryKey(Integer id) {
        return flashPromotionLogMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(FlashPromotionLog record) {
        return flashPromotionLogMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(FlashPromotionLog record) {
        return flashPromotionLogMapper.updateByPrimaryKey(record);
    }

}
