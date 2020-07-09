package com.lhrsite.gmall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.lhrsite.gmall.mapper.FlashPromotionMapper;
import com.lhrsite.gmall.entity.FlashPromotion;
import com.lhrsite.gmall.service.FlashPromotionService;
/**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
@Service
public class FlashPromotionServiceImpl implements FlashPromotionService{

    @Resource
    private FlashPromotionMapper flashPromotionMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return flashPromotionMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(FlashPromotion record) {
        return flashPromotionMapper.insert(record);
    }

    @Override
    public int insertSelective(FlashPromotion record) {
        return flashPromotionMapper.insertSelective(record);
    }

    @Override
    public FlashPromotion selectByPrimaryKey(Long id) {
        return flashPromotionMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(FlashPromotion record) {
        return flashPromotionMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(FlashPromotion record) {
        return flashPromotionMapper.updateByPrimaryKey(record);
    }

}
