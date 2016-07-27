package com.cwh.quick.web.service.impl;

import com.cwh.quick.core.generic.GenericDao;
import com.cwh.quick.core.generic.GenericServiceImpl;
import com.cwh.quick.web.dao.RoleMapper;
import com.cwh.quick.web.model.Role;
import com.cwh.quick.web.service.RoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by cwh on 2016/7/27.
 */
@Service
public class RoleServiceImpl extends GenericServiceImpl<Role,Long> implements RoleService
{

    @Resource
    private RoleMapper roleMapper;

    @Override
    public GenericDao<Role, Long> getDao() {
        return roleMapper;
    }

    @Override
    public List<Role> selectRolesByUserId(Long userId) {
        return roleMapper.selectRolesByUserId(userId);
    }
}
