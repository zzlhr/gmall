package com.lhrsite.gmall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.lhrsite.gmall.mapper.MemberReportMapper;
import com.lhrsite.gmall.entity.MemberReport;
import com.lhrsite.gmall.service.MemberReportService;
/**
 * Description
 * 
 * @author: zzlhr
 * @create: 2020/07/09 16:32
 */
@Service
public class MemberReportServiceImpl implements MemberReportService{

    @Resource
    private MemberReportMapper memberReportMapper;

    @Override
    public int insert(MemberReport record) {
        return memberReportMapper.insert(record);
    }

    @Override
    public int insertSelective(MemberReport record) {
        return memberReportMapper.insertSelective(record);
    }

}
