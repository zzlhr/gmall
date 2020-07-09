package com.lhrsite.gmall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.lhrsite.gmall.mapper.ProductLadderMapper;
import com.lhrsite.gmall.entity.ProductLadder;
import com.lhrsite.gmall.service.ProductLadderService;
/**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
@Service
public class ProductLadderServiceImpl implements ProductLadderService{

    @Resource
    private ProductLadderMapper productLadderMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return productLadderMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ProductLadder record) {
        return productLadderMapper.insert(record);
    }

    @Override
    public int insertSelective(ProductLadder record) {
        return productLadderMapper.insertSelective(record);
    }

    @Override
    public ProductLadder selectByPrimaryKey(Long id) {
        return productLadderMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(ProductLadder record) {
        return productLadderMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ProductLadder record) {
        return productLadderMapper.updateByPrimaryKey(record);
    }

}
