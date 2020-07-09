package com.lhrsite.gmall.service;

import com.lhrsite.gmall.entity.FlashPromotionLog;
    /**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
public interface FlashPromotionLogService{


    int deleteByPrimaryKey(Integer id);

    int insert(FlashPromotionLog record);

    int insertSelective(FlashPromotionLog record);

    FlashPromotionLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FlashPromotionLog record);

    int updateByPrimaryKey(FlashPromotionLog record);

}
