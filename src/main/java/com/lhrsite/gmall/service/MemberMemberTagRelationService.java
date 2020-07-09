package com.lhrsite.gmall.service;

import com.lhrsite.gmall.entity.MemberMemberTagRelation;
    /**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
public interface MemberMemberTagRelationService{


    int deleteByPrimaryKey(Long id);

    int insert(MemberMemberTagRelation record);

    int insertSelective(MemberMemberTagRelation record);

    MemberMemberTagRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MemberMemberTagRelation record);

    int updateByPrimaryKey(MemberMemberTagRelation record);

}
