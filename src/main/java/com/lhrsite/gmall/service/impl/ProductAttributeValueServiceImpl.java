package com.lhrsite.gmall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.lhrsite.gmall.mapper.ProductAttributeValueMapper;
import com.lhrsite.gmall.entity.ProductAttributeValue;
import com.lhrsite.gmall.service.ProductAttributeValueService;
/**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
@Service
public class ProductAttributeValueServiceImpl implements ProductAttributeValueService{

    @Resource
    private ProductAttributeValueMapper productAttributeValueMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return productAttributeValueMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ProductAttributeValue record) {
        return productAttributeValueMapper.insert(record);
    }

    @Override
    public int insertSelective(ProductAttributeValue record) {
        return productAttributeValueMapper.insertSelective(record);
    }

    @Override
    public ProductAttributeValue selectByPrimaryKey(Long id) {
        return productAttributeValueMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(ProductAttributeValue record) {
        return productAttributeValueMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ProductAttributeValue record) {
        return productAttributeValueMapper.updateByPrimaryKey(record);
    }

}
