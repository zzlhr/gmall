package com.lhrsite.gmall.mapper;

import com.lhrsite.gmall.entity.OrderItem;
import org.apache.ibatis.annotations.Mapper;

/**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
@Mapper
public interface OrderItemMapper {
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
    int insert(OrderItem record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(OrderItem record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    OrderItem selectByPrimaryKey(Long id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(OrderItem record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(OrderItem record);
}