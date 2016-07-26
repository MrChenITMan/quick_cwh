package com.cwh.quick.web.dao;

import com.cwh.quick.core.generic.GenericDao;
import com.cwh.quick.web.model.Permission;
import com.cwh.quick.web.model.PermissionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by cwh on 2016/7/26.
 */
public interface PermissionMapper extends GenericDao<Permission, Long>
{
    int countByExample(PermissionExample example);

    int deleteByExample(PermissionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Permission record);

    int insertSelective(Permission record);

    List<Permission> selectByExample(PermissionExample example);

    Permission selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Permission record, @Param("example") PermissionExample example);

    int updateByExample(@Param("record") Permission record, @Param("example") PermissionExample example);

    int updateByPrimaryKeySelective(Permission record);

    int updateByPrimaryKey(Permission record);

    /**
     * 通过角色id 查询角色 拥有的权限
     *
     * @param roleId
     * @return
     */
    List<Permission> selectPermissionsByRoleId(Long roleId);
}
