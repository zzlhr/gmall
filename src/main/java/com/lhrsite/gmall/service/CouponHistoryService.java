package com.lhrsite.gmall.service;

import com.lhrsite.gmall.entity.CouponHistory;
    /**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
public interface CouponHistoryService{


    int deleteByPrimaryKey(Long id);

    int insert(CouponHistory record);

    int insertSelective(CouponHistory record);

    CouponHistory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CouponHistory record);

    int updateByPrimaryKey(CouponHistory record);

}
