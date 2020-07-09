package com.lhrsite.gmall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.lhrsite.gmall.mapper.ProductVertifyRecordMapper;
import com.lhrsite.gmall.entity.ProductVertifyRecord;
import com.lhrsite.gmall.service.ProductVertifyRecordService;
/**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
@Service
public class ProductVertifyRecordServiceImpl implements ProductVertifyRecordService{

    @Resource
    private ProductVertifyRecordMapper productVertifyRecordMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return productVertifyRecordMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ProductVertifyRecord record) {
        return productVertifyRecordMapper.insert(record);
    }

    @Override
    public int insertSelective(ProductVertifyRecord record) {
        return productVertifyRecordMapper.insertSelective(record);
    }

    @Override
    public ProductVertifyRecord selectByPrimaryKey(Long id) {
        return productVertifyRecordMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(ProductVertifyRecord record) {
        return productVertifyRecordMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ProductVertifyRecord record) {
        return productVertifyRecordMapper.updateByPrimaryKey(record);
    }

}
