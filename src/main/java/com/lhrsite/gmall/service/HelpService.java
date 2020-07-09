package com.lhrsite.gmall.service;

import com.lhrsite.gmall.entity.Help;
    /**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
public interface HelpService{


    int deleteByPrimaryKey(Long id);

    int insert(Help record);

    int insertSelective(Help record);

    Help selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Help record);

    int updateByPrimaryKey(Help record);

}
