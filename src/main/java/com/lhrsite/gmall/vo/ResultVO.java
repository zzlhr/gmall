package com.lhrsite.gmall.vo;

import lombok.Data;

@Data
public class ResultVO {

    private Integer code;
    private String msg;
    private Object data;


    public static ResultVO create(Object date) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("ok");
        resultVO.setData(date);
        return resultVO;
    }

    public static ResultVO create() {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("ok");
        return resultVO;
    }


}
