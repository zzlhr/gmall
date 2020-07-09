package com.lhrsite.gmall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.lhrsite.gmall.entity.MemberRuleSetting;
import com.lhrsite.gmall.mapper.MemberRuleSettingMapper;
import com.lhrsite.gmall.service.MemberRuleSettingService;
/**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
@Service
public class MemberRuleSettingServiceImpl implements MemberRuleSettingService{

    @Resource
    private MemberRuleSettingMapper memberRuleSettingMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return memberRuleSettingMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(MemberRuleSetting record) {
        return memberRuleSettingMapper.insert(record);
    }

    @Override
    public int insertSelective(MemberRuleSetting record) {
        return memberRuleSettingMapper.insertSelective(record);
    }

    @Override
    public MemberRuleSetting selectByPrimaryKey(Long id) {
        return memberRuleSettingMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(MemberRuleSetting record) {
        return memberRuleSettingMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(MemberRuleSetting record) {
        return memberRuleSettingMapper.updateByPrimaryKey(record);
    }

}
