package com.example.config;

import com.example.util.Result;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 自定义异常处理器
 */
@RestControllerAdvice
public class InterfaceExceptionHandler {

    /**
     * 系统异常捕获处理
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result exception(Exception e) {
        return Result.failed(e.toString());
    }
}
