package com.lhrsite.gmall.mapper;

import com.lhrsite.gmall.entity.MemberLevel;
import org.apache.ibatis.annotations.Mapper;

/**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
@Mapper
public interface MemberLevelMapper {
    /**
     * delete by primary key
     * @param id primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Long id);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(MemberLevel record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(MemberLevel record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    MemberLevel selectByPrimaryKey(Long id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(MemberLevel record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(MemberLevel record);
}