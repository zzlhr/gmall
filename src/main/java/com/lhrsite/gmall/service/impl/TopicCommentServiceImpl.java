package com.lhrsite.gmall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.lhrsite.gmall.mapper.TopicCommentMapper;
import com.lhrsite.gmall.entity.TopicComment;
import com.lhrsite.gmall.service.TopicCommentService;
/**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
@Service
public class TopicCommentServiceImpl implements TopicCommentService{

    @Resource
    private TopicCommentMapper topicCommentMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return topicCommentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TopicComment record) {
        return topicCommentMapper.insert(record);
    }

    @Override
    public int insertSelective(TopicComment record) {
        return topicCommentMapper.insertSelective(record);
    }

    @Override
    public TopicComment selectByPrimaryKey(Long id) {
        return topicCommentMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(TopicComment record) {
        return topicCommentMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TopicComment record) {
        return topicCommentMapper.updateByPrimaryKey(record);
    }

}
