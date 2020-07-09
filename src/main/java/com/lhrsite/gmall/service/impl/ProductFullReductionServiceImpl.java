package com.lhrsite.gmall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.lhrsite.gmall.entity.ProductFullReduction;
import com.lhrsite.gmall.mapper.ProductFullReductionMapper;
import com.lhrsite.gmall.service.ProductFullReductionService;
/**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
@Service
public class ProductFullReductionServiceImpl implements ProductFullReductionService{

    @Resource
    private ProductFullReductionMapper productFullReductionMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return productFullReductionMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ProductFullReduction record) {
        return productFullReductionMapper.insert(record);
    }

    @Override
    public int insertSelective(ProductFullReduction record) {
        return productFullReductionMapper.insertSelective(record);
    }

    @Override
    public ProductFullReduction selectByPrimaryKey(Long id) {
        return productFullReductionMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(ProductFullReduction record) {
        return productFullReductionMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ProductFullReduction record) {
        return productFullReductionMapper.updateByPrimaryKey(record);
    }

}
