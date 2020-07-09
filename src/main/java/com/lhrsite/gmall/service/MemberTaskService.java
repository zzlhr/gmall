package com.lhrsite.gmall.service;

import com.lhrsite.gmall.entity.MemberTask;
    /**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
public interface MemberTaskService{


    int deleteByPrimaryKey(Long id);

    int insert(MemberTask record);

    int insertSelective(MemberTask record);

    MemberTask selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MemberTask record);

    int updateByPrimaryKey(MemberTask record);

}
