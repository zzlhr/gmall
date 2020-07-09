package com.lhrsite.gmall.service;

import com.lhrsite.gmall.entity.Comment;
    /**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
public interface CommentService{


    int deleteByPrimaryKey(Long id);

    int insert(Comment record);

    int insertSelective(Comment record);

    Comment selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Comment record);

    int updateByPrimaryKey(Comment record);

}
