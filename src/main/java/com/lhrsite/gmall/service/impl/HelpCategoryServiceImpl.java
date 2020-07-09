package com.lhrsite.gmall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.lhrsite.gmall.mapper.HelpCategoryMapper;
import com.lhrsite.gmall.entity.HelpCategory;
import com.lhrsite.gmall.service.HelpCategoryService;
/**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
@Service
public class HelpCategoryServiceImpl implements HelpCategoryService{

    @Resource
    private HelpCategoryMapper helpCategoryMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return helpCategoryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(HelpCategory record) {
        return helpCategoryMapper.insert(record);
    }

    @Override
    public int insertSelective(HelpCategory record) {
        return helpCategoryMapper.insertSelective(record);
    }

    @Override
    public HelpCategory selectByPrimaryKey(Long id) {
        return helpCategoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(HelpCategory record) {
        return helpCategoryMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(HelpCategory record) {
        return helpCategoryMapper.updateByPrimaryKey(record);
    }

}
