package com.orc.sandbox.common.bo;


import com.orc.sandbox.common.constant.StatusCode;
import lombok.Data;

@Data
public class Result <T> {

    private boolean status;

    private Integer code;

    private String msg;

    private T data;

    public Result() {
        this.status = true;
        this.code = StatusCode.OK.getCode();
        this.msg = StatusCode.OK.getmsg();
    }

    public Result(boolean status, Integer code, String msg){
        this.status = status;
        this.code = code;
        this.msg = msg;
    }


}
