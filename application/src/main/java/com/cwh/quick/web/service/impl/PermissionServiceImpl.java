package com.cwh.quick.web.service.impl;

import com.cwh.quick.core.generic.GenericDao;
import com.cwh.quick.core.generic.GenericServiceImpl;
import com.cwh.quick.web.dao.PermissionMapper;
import com.cwh.quick.web.model.Permission;
import com.cwh.quick.web.service.PermissionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by cwh on 2016/7/27.
 */
@Service
public class PermissionServiceImpl extends GenericServiceImpl<Permission, Long> implements PermissionService
{
    @Resource
    private PermissionMapper permissionMapper;


    @Override
    public GenericDao<Permission, Long> getDao()
    {
        return permissionMapper;
    }

    @Override
    public List<Permission> selectPermissionsByRoleId(Long roleId)
    {
        return permissionMapper.selectPermissionsByRoleId(roleId);
    }
}
