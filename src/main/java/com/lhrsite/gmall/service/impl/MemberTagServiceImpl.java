package com.lhrsite.gmall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.lhrsite.gmall.mapper.MemberTagMapper;
import com.lhrsite.gmall.entity.MemberTag;
import com.lhrsite.gmall.service.MemberTagService;
/**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
@Service
public class MemberTagServiceImpl implements MemberTagService{

    @Resource
    private MemberTagMapper memberTagMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return memberTagMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(MemberTag record) {
        return memberTagMapper.insert(record);
    }

    @Override
    public int insertSelective(MemberTag record) {
        return memberTagMapper.insertSelective(record);
    }

    @Override
    public MemberTag selectByPrimaryKey(Long id) {
        return memberTagMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(MemberTag record) {
        return memberTagMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(MemberTag record) {
        return memberTagMapper.updateByPrimaryKey(record);
    }

}
