package com.lhrsite.gmall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.lhrsite.gmall.entity.SubjectComment;
import com.lhrsite.gmall.mapper.SubjectCommentMapper;
import com.lhrsite.gmall.service.SubjectCommentService;
/**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
@Service
public class SubjectCommentServiceImpl implements SubjectCommentService{

    @Resource
    private SubjectCommentMapper subjectCommentMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return subjectCommentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SubjectComment record) {
        return subjectCommentMapper.insert(record);
    }

    @Override
    public int insertSelective(SubjectComment record) {
        return subjectCommentMapper.insertSelective(record);
    }

    @Override
    public SubjectComment selectByPrimaryKey(Long id) {
        return subjectCommentMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SubjectComment record) {
        return subjectCommentMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SubjectComment record) {
        return subjectCommentMapper.updateByPrimaryKey(record);
    }

}
