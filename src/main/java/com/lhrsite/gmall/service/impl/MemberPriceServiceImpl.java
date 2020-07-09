package com.lhrsite.gmall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.lhrsite.gmall.mapper.MemberPriceMapper;
import com.lhrsite.gmall.entity.MemberPrice;
import com.lhrsite.gmall.service.MemberPriceService;
/**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
@Service
public class MemberPriceServiceImpl implements MemberPriceService{

    @Resource
    private MemberPriceMapper memberPriceMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return memberPriceMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(MemberPrice record) {
        return memberPriceMapper.insert(record);
    }

    @Override
    public int insertSelective(MemberPrice record) {
        return memberPriceMapper.insertSelective(record);
    }

    @Override
    public MemberPrice selectByPrimaryKey(Long id) {
        return memberPriceMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(MemberPrice record) {
        return memberPriceMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(MemberPrice record) {
        return memberPriceMapper.updateByPrimaryKey(record);
    }

}
