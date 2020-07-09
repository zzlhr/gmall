package com.lhrsite.gmall.service;

import com.lhrsite.gmall.entity.TopicComment;
    /**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
public interface TopicCommentService{


    int deleteByPrimaryKey(Long id);

    int insert(TopicComment record);

    int insertSelective(TopicComment record);

    TopicComment selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TopicComment record);

    int updateByPrimaryKey(TopicComment record);

}
