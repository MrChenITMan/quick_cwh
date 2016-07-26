package com.cwh.quick.web.dao;

import com.cwh.quick.core.feature.orm.mybatis.Page;
import com.cwh.quick.core.generic.GenericDao;
import com.cwh.quick.web.model.User;
import com.cwh.quick.web.model.UserExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 用户dao接口
 *
 * Created by cwh on 2016/7/26.
 */
@Component
public interface UserMapper extends GenericDao<User,Long>
{
    int countByExample(UserExample example);

    int deletByExample(UserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(User user);

    int insertSelective(User user);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Long id);

    int updateByExample(@Param("record") User user,@Param("example") UserExample example);

    int updateByExampleSelective(@Param("record") User user,@Param("example") UserExample example);

    int updateByPrimaryKeySelective(User user);

    int updateByPrimaryKey(User record);

    /**
     * 用户登录验证查询
     *
     * @param user
     * @return
     */
    User authentication(@Param("record") User user);

    /**
     * 分页条件查询
     *
     * @param page
     * @param example
     * @return
     */
    List<User> selectByExampleAndPage(Page<User> page,UserExample example);
}
