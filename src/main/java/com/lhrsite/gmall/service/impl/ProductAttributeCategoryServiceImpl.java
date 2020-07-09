package com.lhrsite.gmall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.lhrsite.gmall.mapper.ProductAttributeCategoryMapper;
import com.lhrsite.gmall.entity.ProductAttributeCategory;
import com.lhrsite.gmall.service.ProductAttributeCategoryService;
/**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
@Service
public class ProductAttributeCategoryServiceImpl implements ProductAttributeCategoryService{

    @Resource
    private ProductAttributeCategoryMapper productAttributeCategoryMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return productAttributeCategoryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ProductAttributeCategory record) {
        return productAttributeCategoryMapper.insert(record);
    }

    @Override
    public int insertSelective(ProductAttributeCategory record) {
        return productAttributeCategoryMapper.insertSelective(record);
    }

    @Override
    public ProductAttributeCategory selectByPrimaryKey(Long id) {
        return productAttributeCategoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(ProductAttributeCategory record) {
        return productAttributeCategoryMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ProductAttributeCategory record) {
        return productAttributeCategoryMapper.updateByPrimaryKey(record);
    }

}
