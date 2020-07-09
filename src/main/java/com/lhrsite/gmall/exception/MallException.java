package com.lhrsite.gmall.exception;


/**
 * 所有失败返回都会抛出该异常类，如果一个请求出现该类异常即视为成功
 * 所有为成功的逻辑都需要抛出该异常。
 * <p>
 * 改异常的所有内容来源于ErrEnum枚举中的错误。
 */
public class MallException extends Exception {

    private final ErrEnum errEnum;

    public ErrEnum getErrEnum() {
        return errEnum;
    }

    public MallException(ErrEnum errEnum) {
        super("ErpException errCode=" + errEnum.getCode()
                + "errMsg=" + errEnum.getMessage());
        this.errEnum = errEnum;
    }


    public MallException(Integer code, String msg) {
        super("ErpException errCode=" + code
                + "errMsg=" + msg);
        this.errEnum = ErrEnum.getEnum(code);
    }
}
