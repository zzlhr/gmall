package com.lhrsite.gmall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.lhrsite.gmall.entity.MemberTask;
import com.lhrsite.gmall.mapper.MemberTaskMapper;
import com.lhrsite.gmall.service.MemberTaskService;
/**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
@Service
public class MemberTaskServiceImpl implements MemberTaskService{

    @Resource
    private MemberTaskMapper memberTaskMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return memberTaskMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(MemberTask record) {
        return memberTaskMapper.insert(record);
    }

    @Override
    public int insertSelective(MemberTask record) {
        return memberTaskMapper.insertSelective(record);
    }

    @Override
    public MemberTask selectByPrimaryKey(Long id) {
        return memberTaskMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(MemberTask record) {
        return memberTaskMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(MemberTask record) {
        return memberTaskMapper.updateByPrimaryKey(record);
    }

}
