package com.quwen.springboot.common;

public enum ErrorEnum {

    /**
     *  常见异常
     */
    SUCCESS(0, "请求成功."),
    UNKNOWN_ERROR(-10000,"未知错误."),
    CUSTOM_ERROR(-10001,""),
    ILLEGAL_PARAMETER_ERROR(-10002,"非法参数错误:"),
    EMPTY_PARAMETER_ERROR(-10003,"空参数错误:"),

    /**
     *  SQL或数据源异常
     */
    DATA_NOT_EXIST_ERROR(-20000,"数据不存在."),
    DATA_EXIST_ERROR(-20001,"数据已存在."),
    DELETE_DATA_ERROR(-20002,"删除数据失败."),
    INSERT_DATA_ERROR(-20003,"新增数据失败."),
    UPDATE_DATA_ERROR(-20004,"更新数据失败."),

    /**
     *  TOKEN异常
     */
    TOKEN_EMPTY_ERROR(-30000,"TOKEN不能为空."),
    TOKEN_EXPIRE_ERROR(-30001,"TOKEN已过期."),
    TOKEN_VALIDATION_ERROR(-30002,"TOKEN验证失败.")
    ;

    private final Integer msgCode;

    private final String errMsg;

    ErrorEnum(Integer msgCode, String errMsg) {
        this.msgCode = msgCode;
        this.errMsg = errMsg;
    }

    public Integer getMsgCode() {
        return msgCode;
    }

    public String getErrMsg() {
        return errMsg;
    }
}
