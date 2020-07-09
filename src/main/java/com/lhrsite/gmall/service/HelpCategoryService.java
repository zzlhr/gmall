package com.lhrsite.gmall.service;

import com.lhrsite.gmall.entity.HelpCategory;
    /**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
public interface HelpCategoryService{


    int deleteByPrimaryKey(Long id);

    int insert(HelpCategory record);

    int insertSelective(HelpCategory record);

    HelpCategory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(HelpCategory record);

    int updateByPrimaryKey(HelpCategory record);

}
