package com.lhrsite.gmall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.lhrsite.gmall.mapper.CommentReplayMapper;
import com.lhrsite.gmall.entity.CommentReplay;
import com.lhrsite.gmall.service.CommentReplayService;
/**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
@Service
public class CommentReplayServiceImpl implements CommentReplayService{

    @Resource
    private CommentReplayMapper commentReplayMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return commentReplayMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(CommentReplay record) {
        return commentReplayMapper.insert(record);
    }

    @Override
    public int insertSelective(CommentReplay record) {
        return commentReplayMapper.insertSelective(record);
    }

    @Override
    public CommentReplay selectByPrimaryKey(Long id) {
        return commentReplayMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(CommentReplay record) {
        return commentReplayMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(CommentReplay record) {
        return commentReplayMapper.updateByPrimaryKey(record);
    }

}
