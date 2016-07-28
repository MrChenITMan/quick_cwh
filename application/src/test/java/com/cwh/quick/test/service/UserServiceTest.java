package com.cwh.quick.test.service;

import com.cwh.quick.core.feature.test.TestSupport;
import com.cwh.quick.core.util.ApplicationUtils;
import com.cwh.quick.web.model.User;
import com.cwh.quick.web.service.UserService;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.Date;

/**
 * Created by cwh on 2016/7/28.
 */
public class UserServiceTest extends TestSupport
{
    @Resource
    private UserService userService;

    @Test
    public void test_insert(){
        User user = new User();
        user.setUsername("cwh");
        user.setPassword(ApplicationUtils.sha256Hex("123456"));
        user.setCreateTime(new Date());
        userService.insert(user);
    }

    @Test
    public void test_10insert(){
        for (int i = 0; i < 10; i++)
        {
            User user = new User();
            user.setUsername("cwh" + i);
            user.setPassword(ApplicationUtils.sha256Hex("123456"));
            user.setCreateTime(new Date());
            userService.insert(user);
        }
    }

}
