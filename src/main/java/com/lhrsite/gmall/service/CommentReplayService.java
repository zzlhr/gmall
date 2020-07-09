package com.lhrsite.gmall.service;

import com.lhrsite.gmall.entity.CommentReplay;
    /**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
public interface CommentReplayService{


    int deleteByPrimaryKey(Long id);

    int insert(CommentReplay record);

    int insertSelective(CommentReplay record);

    CommentReplay selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CommentReplay record);

    int updateByPrimaryKey(CommentReplay record);

}
