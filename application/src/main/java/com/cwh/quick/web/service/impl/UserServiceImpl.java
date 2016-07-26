package com.cwh.quick.web.service.impl;

import com.cwh.quick.core.generic.GenericDao;
import com.cwh.quick.core.generic.GenericServiceImpl;
import com.cwh.quick.web.dao.UserMapper;
import com.cwh.quick.web.model.User;
import com.cwh.quick.web.model.UserExample;
import com.cwh.quick.web.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by cwh on 2016/7/26.
 */
@Service
public class UserServiceImpl extends GenericServiceImpl<User,Long> implements UserService
{
    @Resource
    private UserMapper userMapper;

    @Override
    public User authentication(User user)
    {
        return userMapper.authentication(user);
    }

    @Override
    public User selectByUsername(String username)
    {
        UserExample example = new UserExample();
        example.createCriteria().andUsernameEqualTo(username);
        final List<User> list = userMapper.selectByExample(example);
        return list.get(0);
    }

    @Override
    public GenericDao<User, Long> getDao()
    {
        return userMapper;
    }

    @Override
    public int insert(User user)
    {
        return userMapper.insertSelective(user);
    }

    @Override
    public int update(User user)
    {
        return userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public int delete(Long id)
    {
        return userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public User selectById(Long id)
    {
        return userMapper.selectByPrimaryKey(id);
    }
}
