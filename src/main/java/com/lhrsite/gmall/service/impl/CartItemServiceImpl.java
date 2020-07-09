package com.lhrsite.gmall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.lhrsite.gmall.entity.CartItem;
import com.lhrsite.gmall.mapper.CartItemMapper;
import com.lhrsite.gmall.service.CartItemService;
/**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
@Service
public class CartItemServiceImpl implements CartItemService{

    @Resource
    private CartItemMapper cartItemMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return cartItemMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(CartItem record) {
        return cartItemMapper.insert(record);
    }

    @Override
    public int insertSelective(CartItem record) {
        return cartItemMapper.insertSelective(record);
    }

    @Override
    public CartItem selectByPrimaryKey(Long id) {
        return cartItemMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(CartItem record) {
        return cartItemMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(CartItem record) {
        return cartItemMapper.updateByPrimaryKey(record);
    }

}
