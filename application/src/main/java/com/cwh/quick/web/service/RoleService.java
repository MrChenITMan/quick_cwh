package com.cwh.quick.web.service;

import com.cwh.quick.core.generic.GenericService;
import com.cwh.quick.web.model.Role;

import java.util.List;

/**
 * 角色业务接口
 *
 * Created by cwh on 2016/7/27.
 */
public interface RoleService extends GenericService<Role,Long>
{
    List<Role> selectRolesByUserId(Long userId);
}
