package com.lhrsite.gmall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.lhrsite.gmall.mapper.PrefrenceAreaMapper;
import com.lhrsite.gmall.entity.PrefrenceArea;
import com.lhrsite.gmall.service.PrefrenceAreaService;
/**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
@Service
public class PrefrenceAreaServiceImpl implements PrefrenceAreaService{

    @Resource
    private PrefrenceAreaMapper prefrenceAreaMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return prefrenceAreaMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PrefrenceArea record) {
        return prefrenceAreaMapper.insert(record);
    }

    @Override
    public int insertSelective(PrefrenceArea record) {
        return prefrenceAreaMapper.insertSelective(record);
    }

    @Override
    public PrefrenceArea selectByPrimaryKey(Long id) {
        return prefrenceAreaMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PrefrenceArea record) {
        return prefrenceAreaMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PrefrenceArea record) {
        return prefrenceAreaMapper.updateByPrimaryKey(record);
    }

}
