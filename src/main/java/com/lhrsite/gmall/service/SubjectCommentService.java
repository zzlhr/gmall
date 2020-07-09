package com.lhrsite.gmall.service;

import com.lhrsite.gmall.entity.SubjectComment;
    /**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
public interface SubjectCommentService{


    int deleteByPrimaryKey(Long id);

    int insert(SubjectComment record);

    int insertSelective(SubjectComment record);

    SubjectComment selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SubjectComment record);

    int updateByPrimaryKey(SubjectComment record);

}
