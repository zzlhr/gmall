package com.lhrsite.gmall.service;

import com.lhrsite.gmall.entity.MemberRuleSetting;
    /**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
public interface MemberRuleSettingService{


    int deleteByPrimaryKey(Long id);

    int insert(MemberRuleSetting record);

    int insertSelective(MemberRuleSetting record);

    MemberRuleSetting selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MemberRuleSetting record);

    int updateByPrimaryKey(MemberRuleSetting record);

}
