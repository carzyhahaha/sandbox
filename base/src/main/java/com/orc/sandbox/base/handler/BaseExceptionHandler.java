package com.orc.sandbox.base.handler;

import com.orc.sandbox.common.bo.Result;
import com.orc.sandbox.common.constant.StatusCode;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class BaseExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public Result error(Exception e) {
        return new Result(false, StatusCode.ERROR.getCode(), e.getMessage());
    }
}
