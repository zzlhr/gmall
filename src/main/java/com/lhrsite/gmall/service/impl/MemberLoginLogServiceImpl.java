package com.lhrsite.gmall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.lhrsite.gmall.entity.MemberLoginLog;
import com.lhrsite.gmall.mapper.MemberLoginLogMapper;
import com.lhrsite.gmall.service.MemberLoginLogService;
/**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
@Service
public class MemberLoginLogServiceImpl implements MemberLoginLogService{

    @Resource
    private MemberLoginLogMapper memberLoginLogMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return memberLoginLogMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(MemberLoginLog record) {
        return memberLoginLogMapper.insert(record);
    }

    @Override
    public int insertSelective(MemberLoginLog record) {
        return memberLoginLogMapper.insertSelective(record);
    }

    @Override
    public MemberLoginLog selectByPrimaryKey(Long id) {
        return memberLoginLogMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(MemberLoginLog record) {
        return memberLoginLogMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(MemberLoginLog record) {
        return memberLoginLogMapper.updateByPrimaryKey(record);
    }

}
