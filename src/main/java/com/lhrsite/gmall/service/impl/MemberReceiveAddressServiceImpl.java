package com.lhrsite.gmall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.lhrsite.gmall.entity.MemberReceiveAddress;
import com.lhrsite.gmall.mapper.MemberReceiveAddressMapper;
import com.lhrsite.gmall.service.MemberReceiveAddressService;
/**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
@Service
public class MemberReceiveAddressServiceImpl implements MemberReceiveAddressService{

    @Resource
    private MemberReceiveAddressMapper memberReceiveAddressMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return memberReceiveAddressMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(MemberReceiveAddress record) {
        return memberReceiveAddressMapper.insert(record);
    }

    @Override
    public int insertSelective(MemberReceiveAddress record) {
        return memberReceiveAddressMapper.insertSelective(record);
    }

    @Override
    public MemberReceiveAddress selectByPrimaryKey(Long id) {
        return memberReceiveAddressMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(MemberReceiveAddress record) {
        return memberReceiveAddressMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(MemberReceiveAddress record) {
        return memberReceiveAddressMapper.updateByPrimaryKey(record);
    }

}
