package com.lhrsite.gmall.service;

import com.lhrsite.gmall.entity.FlashPromotionSession;
    /**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
public interface FlashPromotionSessionService{


    int deleteByPrimaryKey(Long id);

    int insert(FlashPromotionSession record);

    int insertSelective(FlashPromotionSession record);

    FlashPromotionSession selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(FlashPromotionSession record);

    int updateByPrimaryKey(FlashPromotionSession record);

}
