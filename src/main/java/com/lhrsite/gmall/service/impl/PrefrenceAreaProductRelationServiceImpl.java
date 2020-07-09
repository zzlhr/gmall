package com.lhrsite.gmall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.lhrsite.gmall.mapper.PrefrenceAreaProductRelationMapper;
import com.lhrsite.gmall.entity.PrefrenceAreaProductRelation;
import com.lhrsite.gmall.service.PrefrenceAreaProductRelationService;
/**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
@Service
public class PrefrenceAreaProductRelationServiceImpl implements PrefrenceAreaProductRelationService{

    @Resource
    private PrefrenceAreaProductRelationMapper prefrenceAreaProductRelationMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return prefrenceAreaProductRelationMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PrefrenceAreaProductRelation record) {
        return prefrenceAreaProductRelationMapper.insert(record);
    }

    @Override
    public int insertSelective(PrefrenceAreaProductRelation record) {
        return prefrenceAreaProductRelationMapper.insertSelective(record);
    }

    @Override
    public PrefrenceAreaProductRelation selectByPrimaryKey(Long id) {
        return prefrenceAreaProductRelationMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PrefrenceAreaProductRelation record) {
        return prefrenceAreaProductRelationMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PrefrenceAreaProductRelation record) {
        return prefrenceAreaProductRelationMapper.updateByPrimaryKey(record);
    }

}
