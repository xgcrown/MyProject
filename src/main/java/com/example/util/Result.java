package com.example.util;

import lombok.Data;

@Data
public class Result<T> {
    private int code;
    private String message;
    private T data;

    public static <T> Result<T> success(T t) {
        Result<T> result = new Result<>();
        result.code = 200;
        result.message = "ok";
        result.data = t;
        return result;
    }

    public static Result<Object> failed(String message) {
        Result<Object> result = new Result<>();
        result.code = 500;
        result.message = message;
        return result;
    }
}