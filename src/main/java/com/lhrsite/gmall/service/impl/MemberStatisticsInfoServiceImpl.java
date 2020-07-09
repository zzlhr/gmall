package com.lhrsite.gmall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.lhrsite.gmall.mapper.MemberStatisticsInfoMapper;
import com.lhrsite.gmall.entity.MemberStatisticsInfo;
import com.lhrsite.gmall.service.MemberStatisticsInfoService;
/**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
@Service
public class MemberStatisticsInfoServiceImpl implements MemberStatisticsInfoService{

    @Resource
    private MemberStatisticsInfoMapper memberStatisticsInfoMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return memberStatisticsInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(MemberStatisticsInfo record) {
        return memberStatisticsInfoMapper.insert(record);
    }

    @Override
    public int insertSelective(MemberStatisticsInfo record) {
        return memberStatisticsInfoMapper.insertSelective(record);
    }

    @Override
    public MemberStatisticsInfo selectByPrimaryKey(Long id) {
        return memberStatisticsInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(MemberStatisticsInfo record) {
        return memberStatisticsInfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(MemberStatisticsInfo record) {
        return memberStatisticsInfoMapper.updateByPrimaryKey(record);
    }

}
