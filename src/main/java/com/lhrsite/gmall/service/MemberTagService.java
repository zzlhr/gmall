package com.lhrsite.gmall.service;

import com.lhrsite.gmall.entity.MemberTag;
    /**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
public interface MemberTagService{


    int deleteByPrimaryKey(Long id);

    int insert(MemberTag record);

    int insertSelective(MemberTag record);

    MemberTag selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MemberTag record);

    int updateByPrimaryKey(MemberTag record);

}
