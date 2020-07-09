package com.lhrsite.gmall.service;

import com.lhrsite.gmall.entity.FlashPromotionProductRelation;
    /**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
public interface FlashPromotionProductRelationService{


    int deleteByPrimaryKey(Long id);

    int insert(FlashPromotionProductRelation record);

    int insertSelective(FlashPromotionProductRelation record);

    FlashPromotionProductRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(FlashPromotionProductRelation record);

    int updateByPrimaryKey(FlashPromotionProductRelation record);

}
