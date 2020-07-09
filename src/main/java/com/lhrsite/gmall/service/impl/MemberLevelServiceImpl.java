package com.lhrsite.gmall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.lhrsite.gmall.mapper.MemberLevelMapper;
import com.lhrsite.gmall.entity.MemberLevel;
import com.lhrsite.gmall.service.MemberLevelService;
/**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
@Service
public class MemberLevelServiceImpl implements MemberLevelService{

    @Resource
    private MemberLevelMapper memberLevelMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return memberLevelMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(MemberLevel record) {
        return memberLevelMapper.insert(record);
    }

    @Override
    public int insertSelective(MemberLevel record) {
        return memberLevelMapper.insertSelective(record);
    }

    @Override
    public MemberLevel selectByPrimaryKey(Long id) {
        return memberLevelMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(MemberLevel record) {
        return memberLevelMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(MemberLevel record) {
        return memberLevelMapper.updateByPrimaryKey(record);
    }

}
