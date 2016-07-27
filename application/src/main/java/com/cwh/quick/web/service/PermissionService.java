package com.cwh.quick.web.service;

import com.cwh.quick.core.generic.GenericService;
import com.cwh.quick.web.model.Permission;

import java.util.List;

/**
 * 权限业务接口
 *
 * Created by cwh on 2016/7/27.
 */
public interface PermissionService extends GenericService<Permission,Long>
{
    /**
     * 通过角色id查询角色拥有的权限
     * @param roleId
     * @return
     */
    List<Permission> selectPermissionsByRoleId(Long roleId);
}
