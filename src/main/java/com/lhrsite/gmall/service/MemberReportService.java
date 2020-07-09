package com.lhrsite.gmall.service;

import com.lhrsite.gmall.entity.MemberReport;
    /**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
public interface MemberReportService{


    int insert(MemberReport record);

    int insertSelective(MemberReport record);

}
