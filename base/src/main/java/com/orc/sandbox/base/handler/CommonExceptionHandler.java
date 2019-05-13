package com.orc.sandbox.base.handler;

import com.orc.sandbox.base.bo.Result;
import com.orc.sandbox.base.constant.StatusCode;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CommonExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public Result error(Exception e) {
        return new Result(false, StatusCode.ERROR.getCode(), e.getMessage());
    }

}
