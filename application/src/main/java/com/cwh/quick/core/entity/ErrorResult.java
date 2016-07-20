package com.cwh.quick.core.entity;

import java.util.HashMap;
import java.util.Map;

/**
 * ErrorResult : 用于响应错误的请求的对象
 * <p>
 * Created by cwh on 2016/7/20.
 */
public class ErrorResult extends Result
{
    public ErrorResult(){}

    public Map<String, Object> getErrors()
    {
        return errors;
    }

    public void setErrors(Map<String, Object> errors)
    {
        this.errors = errors;
    }

    /**
    * 封装多个 错误信息
    */
    private Map<String,Object> errors = new HashMap<>();

}
