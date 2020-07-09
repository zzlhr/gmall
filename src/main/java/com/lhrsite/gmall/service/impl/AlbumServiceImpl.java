package com.lhrsite.gmall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.lhrsite.gmall.mapper.AlbumMapper;
import com.lhrsite.gmall.entity.Album;
import com.lhrsite.gmall.service.AlbumService;
/**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
@Service
public class AlbumServiceImpl implements AlbumService{

    @Resource
    private AlbumMapper albumMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return albumMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Album record) {
        return albumMapper.insert(record);
    }

    @Override
    public int insertSelective(Album record) {
        return albumMapper.insertSelective(record);
    }

    @Override
    public Album selectByPrimaryKey(Long id) {
        return albumMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Album record) {
        return albumMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Album record) {
        return albumMapper.updateByPrimaryKey(record);
    }

}
