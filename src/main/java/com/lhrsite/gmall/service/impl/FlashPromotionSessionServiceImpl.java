package com.lhrsite.gmall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.lhrsite.gmall.entity.FlashPromotionSession;
import com.lhrsite.gmall.mapper.FlashPromotionSessionMapper;
import com.lhrsite.gmall.service.FlashPromotionSessionService;
/**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
@Service
public class FlashPromotionSessionServiceImpl implements FlashPromotionSessionService{

    @Resource
    private FlashPromotionSessionMapper flashPromotionSessionMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return flashPromotionSessionMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(FlashPromotionSession record) {
        return flashPromotionSessionMapper.insert(record);
    }

    @Override
    public int insertSelective(FlashPromotionSession record) {
        return flashPromotionSessionMapper.insertSelective(record);
    }

    @Override
    public FlashPromotionSession selectByPrimaryKey(Long id) {
        return flashPromotionSessionMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(FlashPromotionSession record) {
        return flashPromotionSessionMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(FlashPromotionSession record) {
        return flashPromotionSessionMapper.updateByPrimaryKey(record);
    }

}
