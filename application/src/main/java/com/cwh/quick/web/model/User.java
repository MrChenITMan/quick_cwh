package com.cwh.quick.web.model;

import java.util.Date;

/**
 * 用户模型
 *
 * Created by cwh on 2016/7/26.
 */
public class User
{
    private Long id;

    private String username;

    private String password;

    private String state;

    private Date createTime;

    @Override
    public String toString()
    {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", state='" + state + '\'' +
                ", createTime=" + createTime +
                '}';
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getState()
    {
        return state;
    }

    public void setState(String state)
    {
        this.state = state;
    }

    public Date getCreateTime()
    {
        return createTime;
    }

    public void setCreateTime(Date createTime)
    {
        this.createTime = createTime;
    }

    public User(){

    }

    public User(String username,String password){
        this.username = username;
        this.password = password;
    }
}
