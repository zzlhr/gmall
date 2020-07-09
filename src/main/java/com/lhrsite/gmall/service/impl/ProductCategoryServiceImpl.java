package com.lhrsite.gmall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.lhrsite.gmall.entity.ProductCategory;
import com.lhrsite.gmall.mapper.ProductCategoryMapper;
import com.lhrsite.gmall.service.ProductCategoryService;
/**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
@Service
public class ProductCategoryServiceImpl implements ProductCategoryService{

    @Resource
    private ProductCategoryMapper productCategoryMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return productCategoryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ProductCategory record) {
        return productCategoryMapper.insert(record);
    }

    @Override
    public int insertSelective(ProductCategory record) {
        return productCategoryMapper.insertSelective(record);
    }

    @Override
    public ProductCategory selectByPrimaryKey(Long id) {
        return productCategoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(ProductCategory record) {
        return productCategoryMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ProductCategory record) {
        return productCategoryMapper.updateByPrimaryKey(record);
    }

}
