package com.cwh.quick.test.dao;

import com.cwh.quick.core.feature.orm.mybatis.Page;
import com.cwh.quick.core.feature.test.TestSupport;
import com.cwh.quick.web.dao.UserMapper;
import com.cwh.quick.web.model.User;
import com.cwh.quick.web.model.UserExample;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by cwh on 2016/7/26.
 */
public class UserMapperTest extends TestSupport
{
    @Resource
    private UserMapper userMapper;

    @Test
    public void test_selectByExampleAndPage()
    {
        start();
        Page<User> page = new Page<>(1, 3);
        UserExample example = new UserExample();
        example.createCriteria().andIdGreaterThan(0L);
        final List<User> users = userMapper.selectByExampleAndPage(page, example);
        for (User user : users)
        {
            System.err.println(user);
        }
        end();
    }
}
