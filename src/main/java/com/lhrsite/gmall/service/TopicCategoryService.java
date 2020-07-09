package com.lhrsite.gmall.service;

import com.lhrsite.gmall.entity.TopicCategory;
    /**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
public interface TopicCategoryService{


    int deleteByPrimaryKey(Long id);

    int insert(TopicCategory record);

    int insertSelective(TopicCategory record);

    TopicCategory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TopicCategory record);

    int updateByPrimaryKey(TopicCategory record);

}
