package com.lhrsite.gmall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.lhrsite.gmall.mapper.HomeRecommendSubjectMapper;
import com.lhrsite.gmall.entity.HomeRecommendSubject;
import com.lhrsite.gmall.service.HomeRecommendSubjectService;
/**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
@Service
public class HomeRecommendSubjectServiceImpl implements HomeRecommendSubjectService{

    @Resource
    private HomeRecommendSubjectMapper homeRecommendSubjectMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return homeRecommendSubjectMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(HomeRecommendSubject record) {
        return homeRecommendSubjectMapper.insert(record);
    }

    @Override
    public int insertSelective(HomeRecommendSubject record) {
        return homeRecommendSubjectMapper.insertSelective(record);
    }

    @Override
    public HomeRecommendSubject selectByPrimaryKey(Long id) {
        return homeRecommendSubjectMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(HomeRecommendSubject record) {
        return homeRecommendSubjectMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(HomeRecommendSubject record) {
        return homeRecommendSubjectMapper.updateByPrimaryKey(record);
    }

}
