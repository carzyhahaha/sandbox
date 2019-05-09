package com.orc.sandbox.common.constant;

/**
 * 状态码常量
 */
public enum  StatusCode {

    OK(20000, "成功"),
    ERROR(20001, "失败"),
    LOGINGERRO(20002, "用户或密码错误"),
    ACCESSERROR(20003, "权限不足"),
    REMOTEERROR(20004, "远程调用错误"),
    REPERROR(20005, "重复操作"),
    TIMEOUT(20006, "操作超时");

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
