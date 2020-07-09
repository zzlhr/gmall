package com.lhrsite.gmall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.lhrsite.gmall.mapper.ProductCategoryAttributeRelationMapper;
import com.lhrsite.gmall.entity.ProductCategoryAttributeRelation;
import com.lhrsite.gmall.service.ProductCategoryAttributeRelationService;
/**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
@Service
public class ProductCategoryAttributeRelationServiceImpl implements ProductCategoryAttributeRelationService{

    @Resource
    private ProductCategoryAttributeRelationMapper productCategoryAttributeRelationMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return productCategoryAttributeRelationMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ProductCategoryAttributeRelation record) {
        return productCategoryAttributeRelationMapper.insert(record);
    }

    @Override
    public int insertSelective(ProductCategoryAttributeRelation record) {
        return productCategoryAttributeRelationMapper.insertSelective(record);
    }

    @Override
    public ProductCategoryAttributeRelation selectByPrimaryKey(Long id) {
        return productCategoryAttributeRelationMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(ProductCategoryAttributeRelation record) {
        return productCategoryAttributeRelationMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ProductCategoryAttributeRelation record) {
        return productCategoryAttributeRelationMapper.updateByPrimaryKey(record);
    }

}
