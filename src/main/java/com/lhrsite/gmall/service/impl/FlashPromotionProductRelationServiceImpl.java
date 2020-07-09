package com.lhrsite.gmall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.lhrsite.gmall.entity.FlashPromotionProductRelation;
import com.lhrsite.gmall.mapper.FlashPromotionProductRelationMapper;
import com.lhrsite.gmall.service.FlashPromotionProductRelationService;
/**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
@Service
public class FlashPromotionProductRelationServiceImpl implements FlashPromotionProductRelationService{

    @Resource
    private FlashPromotionProductRelationMapper flashPromotionProductRelationMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return flashPromotionProductRelationMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(FlashPromotionProductRelation record) {
        return flashPromotionProductRelationMapper.insert(record);
    }

    @Override
    public int insertSelective(FlashPromotionProductRelation record) {
        return flashPromotionProductRelationMapper.insertSelective(record);
    }

    @Override
    public FlashPromotionProductRelation selectByPrimaryKey(Long id) {
        return flashPromotionProductRelationMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(FlashPromotionProductRelation record) {
        return flashPromotionProductRelationMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(FlashPromotionProductRelation record) {
        return flashPromotionProductRelationMapper.updateByPrimaryKey(record);
    }

}
