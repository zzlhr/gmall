package com.lhrsite.gmall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.lhrsite.gmall.mapper.ProductAttributeMapper;
import com.lhrsite.gmall.entity.ProductAttribute;
import com.lhrsite.gmall.service.ProductAttributeService;
/**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
@Service
public class ProductAttributeServiceImpl implements ProductAttributeService{

    @Resource
    private ProductAttributeMapper productAttributeMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return productAttributeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ProductAttribute record) {
        return productAttributeMapper.insert(record);
    }

    @Override
    public int insertSelective(ProductAttribute record) {
        return productAttributeMapper.insertSelective(record);
    }

    @Override
    public ProductAttribute selectByPrimaryKey(Long id) {
        return productAttributeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(ProductAttribute record) {
        return productAttributeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ProductAttribute record) {
        return productAttributeMapper.updateByPrimaryKey(record);
    }

}
