package com.cwh.quick.core.entity;

/**
 * UserException 用户自定义异常
 * Created by cwh on 2016/7/20.
 */
public class UserException extends RuntimeException
{
    private long date = System.currentTimeMillis();

    public long getDate()
    {
        return date;
    }
}
