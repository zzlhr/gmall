package com.lhrsite.gmall.mapper;

import com.lhrsite.gmall.entity.Admin;
import com.lhrsite.gmall.vo.AdminDetailVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * Description
 *
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
@Mapper
public interface AdminMapper {
    /**
     * delete by primary key
     *
     * @param id primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Long id);

    /**
     * insert record to table
     *
     * @param record the record
     * @return insert count
     */
    int insert(Admin record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(Admin record);

    /**
     * select by primary key
     *
     * @param id primary key
     * @return object by primary key
     */
    Admin selectByPrimaryKey(Long id);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(Admin record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(Admin record);

    AdminDetailVO selectByUsername(String username);
}