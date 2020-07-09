package com.lhrsite.gmall.service;

import com.lhrsite.gmall.entity.AlbumPic;
    /**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
public interface AlbumPicService{


    int deleteByPrimaryKey(Long id);

    int insert(AlbumPic record);

    int insertSelective(AlbumPic record);

    AlbumPic selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AlbumPic record);

    int updateByPrimaryKey(AlbumPic record);

}
