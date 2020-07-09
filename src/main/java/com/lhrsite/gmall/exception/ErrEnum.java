package com.lhrsite.gmall.exception;

public enum ErrEnum {

    // 用户相关错误
    USER_NOT_EXIST(10001, "用户不存在"),
    ERROR_AUTH_CODE(10002, "错误的授权码"),
    ACCESS_TOKEN_EXPIRED(10003, "token过期"),
    PHONE_IS_EXIST(10004, "手机号已存在"),
    NO_LOGIN(10005, "没有登录"),

    // open client 客户端相关
    OP_CLIENT_NOT_FOUND(11001, "找不到客户端"),

    // 权限相关
    NOT_FOUND_AUTH_GROUP_IN_THIS_ENTERPRISE(12001, "该用户在当前企业没有权限组"),
    AUTH_GROUP_EXIST(12001, "权限组已存在,请重新输入权限组"),

    // 企业相关
    NOT_FOUND_ENTERPRISE(13001, "找不到该企业"),
    ENTERPRISE_NAME_EXIST(-13002, "企业名称已存在"),
    ENTERPRISE_INFO_MISSING(-13003, "企业信息不完善"),
    ENTERPRISE_id_EXIST(-13004, "企业id已存在"),

    // 文件上传相关
    UPLOAD_FILE_ERROR(-100117, "上传文件失败"),
    DOWNLOAD_FILE_ERROR(-100118, "下载文件失败！"),
    JOURNALISM_IMG_NULL(-100138, "新闻图片为空"),


    //角色相关
    ROLE_NAME_NULL(-14001, "角色名称不能为空");


    private Integer code;
    private String message;

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    ErrEnum(Integer code, String message) {
        this.message = message;
        this.code = code;
    }


    public static ErrEnum getEnum(Integer code) {
        for (ErrEnum errEnum : values()) {
            if (errEnum.getCode().equals(code)) {
                return errEnum;
            }
        }
        return null;
    }


}
