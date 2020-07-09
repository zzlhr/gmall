package com.lhrsite.gmall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.lhrsite.gmall.mapper.SubjectCategoryMapper;
import com.lhrsite.gmall.entity.SubjectCategory;
import com.lhrsite.gmall.service.SubjectCategoryService;
/**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
@Service
public class SubjectCategoryServiceImpl implements SubjectCategoryService{

    @Resource
    private SubjectCategoryMapper subjectCategoryMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return subjectCategoryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SubjectCategory record) {
        return subjectCategoryMapper.insert(record);
    }

    @Override
    public int insertSelective(SubjectCategory record) {
        return subjectCategoryMapper.insertSelective(record);
    }

    @Override
    public SubjectCategory selectByPrimaryKey(Long id) {
        return subjectCategoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SubjectCategory record) {
        return subjectCategoryMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SubjectCategory record) {
        return subjectCategoryMapper.updateByPrimaryKey(record);
    }

}
