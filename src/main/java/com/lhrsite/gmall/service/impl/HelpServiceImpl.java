package com.lhrsite.gmall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.lhrsite.gmall.entity.Help;
import com.lhrsite.gmall.mapper.HelpMapper;
import com.lhrsite.gmall.service.HelpService;
/**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
@Service
public class HelpServiceImpl implements HelpService{

    @Resource
    private HelpMapper helpMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return helpMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Help record) {
        return helpMapper.insert(record);
    }

    @Override
    public int insertSelective(Help record) {
        return helpMapper.insertSelective(record);
    }

    @Override
    public Help selectByPrimaryKey(Long id) {
        return helpMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Help record) {
        return helpMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Help record) {
        return helpMapper.updateByPrimaryKey(record);
    }

}
