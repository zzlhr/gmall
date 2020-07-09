package com.lhrsite.gmall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.lhrsite.gmall.mapper.SubjectProductRelationMapper;
import com.lhrsite.gmall.entity.SubjectProductRelation;
import com.lhrsite.gmall.service.SubjectProductRelationService;
/**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
@Service
public class SubjectProductRelationServiceImpl implements SubjectProductRelationService{

    @Resource
    private SubjectProductRelationMapper subjectProductRelationMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return subjectProductRelationMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SubjectProductRelation record) {
        return subjectProductRelationMapper.insert(record);
    }

    @Override
    public int insertSelective(SubjectProductRelation record) {
        return subjectProductRelationMapper.insertSelective(record);
    }

    @Override
    public SubjectProductRelation selectByPrimaryKey(Long id) {
        return subjectProductRelationMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SubjectProductRelation record) {
        return subjectProductRelationMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SubjectProductRelation record) {
        return subjectProductRelationMapper.updateByPrimaryKey(record);
    }

}
