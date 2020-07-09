package com.lhrsite.gmall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.lhrsite.gmall.mapper.SkuStockMapper;
import com.lhrsite.gmall.entity.SkuStock;
import com.lhrsite.gmall.service.SkuStockService;
/**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
@Service
public class SkuStockServiceImpl implements SkuStockService{

    @Resource
    private SkuStockMapper skuStockMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return skuStockMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SkuStock record) {
        return skuStockMapper.insert(record);
    }

    @Override
    public int insertSelective(SkuStock record) {
        return skuStockMapper.insertSelective(record);
    }

    @Override
    public SkuStock selectByPrimaryKey(Long id) {
        return skuStockMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SkuStock record) {
        return skuStockMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SkuStock record) {
        return skuStockMapper.updateByPrimaryKey(record);
    }

}
