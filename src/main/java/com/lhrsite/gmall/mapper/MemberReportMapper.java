package com.lhrsite.gmall.mapper;

import com.lhrsite.gmall.entity.MemberReport;
import org.apache.ibatis.annotations.Mapper;

/**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
@Mapper
public interface MemberReportMapper {
    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(MemberReport record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(MemberReport record);
}