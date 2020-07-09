package com.lhrsite.gmall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.lhrsite.gmall.entity.AlbumPic;
import com.lhrsite.gmall.mapper.AlbumPicMapper;
import com.lhrsite.gmall.service.AlbumPicService;
/**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
@Service
public class AlbumPicServiceImpl implements AlbumPicService{

    @Resource
    private AlbumPicMapper albumPicMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return albumPicMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(AlbumPic record) {
        return albumPicMapper.insert(record);
    }

    @Override
    public int insertSelective(AlbumPic record) {
        return albumPicMapper.insertSelective(record);
    }

    @Override
    public AlbumPic selectByPrimaryKey(Long id) {
        return albumPicMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(AlbumPic record) {
        return albumPicMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(AlbumPic record) {
        return albumPicMapper.updateByPrimaryKey(record);
    }

}
