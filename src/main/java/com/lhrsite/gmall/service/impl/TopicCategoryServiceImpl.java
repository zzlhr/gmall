package com.lhrsite.gmall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.lhrsite.gmall.mapper.TopicCategoryMapper;
import com.lhrsite.gmall.entity.TopicCategory;
import com.lhrsite.gmall.service.TopicCategoryService;
/**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
@Service
public class TopicCategoryServiceImpl implements TopicCategoryService{

    @Resource
    private TopicCategoryMapper topicCategoryMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return topicCategoryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TopicCategory record) {
        return topicCategoryMapper.insert(record);
    }

    @Override
    public int insertSelective(TopicCategory record) {
        return topicCategoryMapper.insertSelective(record);
    }

    @Override
    public TopicCategory selectByPrimaryKey(Long id) {
        return topicCategoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(TopicCategory record) {
        return topicCategoryMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TopicCategory record) {
        return topicCategoryMapper.updateByPrimaryKey(record);
    }

}
