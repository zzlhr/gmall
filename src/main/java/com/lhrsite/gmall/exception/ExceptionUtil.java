package com.lhrsite.gmall.exception;

import com.alibaba.fastjson.JSON;
import com.lhrsite.gmall.vo.ResultVO;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ExceptionUtil {
    public static void defaultErrorHandler(HttpServletRequest request,
                                           HttpServletResponse response,
                                           MallException e)
            throws IOException {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(e.getErrEnum().getCode());
        resultVO.setMsg(e.getErrEnum().getMessage());
        response.setHeader("Content-type", "application/json;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.append(JSON.toJSONString(resultVO));
        out.flush();
        out.close();
    }
}
