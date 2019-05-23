package com.orc.sandbox.base.constant;

/**
 * 状态码常量
 */
public enum  StatusCode {

    OK(20000, "Success"),
    ERROR(20001, "Faild"),
    LOGINGERRO(20002, "Access error"),
    ACCESSERROR(20003, "Permission denied"),
    REMOTEERROR(20004, "Remote error"),
    REPERROR(20005, "Repe operation"),
    TIMEOUT(20006, "Timeout");

    private StatusCode(int code, String msg){
        this.code = code;
        this.msg = msg;
    };

    private int code;

    private String msg;

    public int getCode() {
        return code;
    }

    public String getmsg() {
        return msg;
    }


}
