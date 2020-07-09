package com.lhrsite.gmall.service;

import com.lhrsite.gmall.entity.FlashPromotion;
    /**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
public interface FlashPromotionService{


    int deleteByPrimaryKey(Long id);

    int insert(FlashPromotion record);

    int insertSelective(FlashPromotion record);

    FlashPromotion selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(FlashPromotion record);

    int updateByPrimaryKey(FlashPromotion record);

}
