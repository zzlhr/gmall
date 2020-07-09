package com.lhrsite.gmall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.lhrsite.gmall.mapper.ResourceCategoryMapper;
import com.lhrsite.gmall.entity.ResourceCategory;
import com.lhrsite.gmall.service.ResourceCategoryService;
/**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
@Service
public class ResourceCategoryServiceImpl implements ResourceCategoryService{

    @Resource
    private ResourceCategoryMapper resourceCategoryMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return resourceCategoryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ResourceCategory record) {
        return resourceCategoryMapper.insert(record);
    }

    @Override
    public int insertSelective(ResourceCategory record) {
        return resourceCategoryMapper.insertSelective(record);
    }

    @Override
    public ResourceCategory selectByPrimaryKey(Long id) {
        return resourceCategoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(ResourceCategory record) {
        return resourceCategoryMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ResourceCategory record) {
        return resourceCategoryMapper.updateByPrimaryKey(record);
    }

}
