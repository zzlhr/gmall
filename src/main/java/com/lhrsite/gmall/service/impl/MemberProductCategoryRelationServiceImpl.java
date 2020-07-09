package com.lhrsite.gmall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.lhrsite.gmall.entity.MemberProductCategoryRelation;
import com.lhrsite.gmall.mapper.MemberProductCategoryRelationMapper;
import com.lhrsite.gmall.service.MemberProductCategoryRelationService;
/**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
@Service
public class MemberProductCategoryRelationServiceImpl implements MemberProductCategoryRelationService{

    @Resource
    private MemberProductCategoryRelationMapper memberProductCategoryRelationMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return memberProductCategoryRelationMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(MemberProductCategoryRelation record) {
        return memberProductCategoryRelationMapper.insert(record);
    }

    @Override
    public int insertSelective(MemberProductCategoryRelation record) {
        return memberProductCategoryRelationMapper.insertSelective(record);
    }

    @Override
    public MemberProductCategoryRelation selectByPrimaryKey(Long id) {
        return memberProductCategoryRelationMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(MemberProductCategoryRelation record) {
        return memberProductCategoryRelationMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(MemberProductCategoryRelation record) {
        return memberProductCategoryRelationMapper.updateByPrimaryKey(record);
    }

}
