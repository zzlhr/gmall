package com.lhrsite.gmall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.lhrsite.gmall.mapper.ProductOperateLogMapper;
import com.lhrsite.gmall.entity.ProductOperateLog;
import com.lhrsite.gmall.service.ProductOperateLogService;
/**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
@Service
public class ProductOperateLogServiceImpl implements ProductOperateLogService{

    @Resource
    private ProductOperateLogMapper productOperateLogMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return productOperateLogMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ProductOperateLog record) {
        return productOperateLogMapper.insert(record);
    }

    @Override
    public int insertSelective(ProductOperateLog record) {
        return productOperateLogMapper.insertSelective(record);
    }

    @Override
    public ProductOperateLog selectByPrimaryKey(Long id) {
        return productOperateLogMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(ProductOperateLog record) {
        return productOperateLogMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ProductOperateLog record) {
        return productOperateLogMapper.updateByPrimaryKey(record);
    }

}
