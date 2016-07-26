package com.cwh.quick.web.service;

import com.cwh.quick.core.generic.GenericService;
import com.cwh.quick.web.model.User;

/**
 * 用户业务接口
 * Created by cwh on 2016/7/26.
 */
public interface UserService extends GenericService<User,Long>
{
    /**
     * 用户验证
     * @param user
     * @return
     */
    User authentication(User user);

    /**
     * 根据用户名查询用户
     * @param username
     * @return
     */
    User selectByUsername(String username);
}
