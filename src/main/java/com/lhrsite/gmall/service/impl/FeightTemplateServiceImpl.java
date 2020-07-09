package com.lhrsite.gmall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.lhrsite.gmall.entity.FeightTemplate;
import com.lhrsite.gmall.mapper.FeightTemplateMapper;
import com.lhrsite.gmall.service.FeightTemplateService;
/**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
@Service
public class FeightTemplateServiceImpl implements FeightTemplateService{

    @Resource
    private FeightTemplateMapper feightTemplateMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return feightTemplateMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(FeightTemplate record) {
        return feightTemplateMapper.insert(record);
    }

    @Override
    public int insertSelective(FeightTemplate record) {
        return feightTemplateMapper.insertSelective(record);
    }

    @Override
    public FeightTemplate selectByPrimaryKey(Long id) {
        return feightTemplateMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(FeightTemplate record) {
        return feightTemplateMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(FeightTemplate record) {
        return feightTemplateMapper.updateByPrimaryKey(record);
    }

}
