package com.lhrsite.gmall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.lhrsite.gmall.mapper.MemberMemberTagRelationMapper;
import com.lhrsite.gmall.entity.MemberMemberTagRelation;
import com.lhrsite.gmall.service.MemberMemberTagRelationService;
/**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
@Service
public class MemberMemberTagRelationServiceImpl implements MemberMemberTagRelationService{

    @Resource
    private MemberMemberTagRelationMapper memberMemberTagRelationMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return memberMemberTagRelationMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(MemberMemberTagRelation record) {
        return memberMemberTagRelationMapper.insert(record);
    }

    @Override
    public int insertSelective(MemberMemberTagRelation record) {
        return memberMemberTagRelationMapper.insertSelective(record);
    }

    @Override
    public MemberMemberTagRelation selectByPrimaryKey(Long id) {
        return memberMemberTagRelationMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(MemberMemberTagRelation record) {
        return memberMemberTagRelationMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(MemberMemberTagRelation record) {
        return memberMemberTagRelationMapper.updateByPrimaryKey(record);
    }

}
