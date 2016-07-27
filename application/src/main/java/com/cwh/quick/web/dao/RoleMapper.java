package com.cwh.quick.web.dao;

import com.cwh.quick.core.generic.GenericDao;
import com.cwh.quick.web.model.Role;
import com.cwh.quick.web.model.RoleExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 角色DAO 接口
 *
 * Created by cwh on 2016/7/27.
 */
public interface RoleMapper extends GenericDao<Role,Long>
{

    int countByExample(RoleExample example);

    int deleteByExample(RoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Role record);

    int insertSelective(Role record);

    List<Role> selectByExample(RoleExample example);

    Role selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Role record, @Param("example") RoleExample example);

    int updateByExample(@Param("record") Role record, @Param("example") RoleExample example);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);

    /**
     * 通过用户id 查询用户 拥有的角色
     *
     * @param id
     * @return
     */
    List<Role> selectRolesByUserId(Long userId);
}
