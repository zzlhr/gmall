package com.lhrsite.gmall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.lhrsite.gmall.entity.Comment;
import com.lhrsite.gmall.mapper.CommentMapper;
import com.lhrsite.gmall.service.CommentService;
/**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
@Service
public class CommentServiceImpl implements CommentService{

    @Resource
    private CommentMapper commentMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return commentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Comment record) {
        return commentMapper.insert(record);
    }

    @Override
    public int insertSelective(Comment record) {
        return commentMapper.insertSelective(record);
    }

    @Override
    public Comment selectByPrimaryKey(Long id) {
        return commentMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Comment record) {
        return commentMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Comment record) {
        return commentMapper.updateByPrimaryKey(record);
    }

}
