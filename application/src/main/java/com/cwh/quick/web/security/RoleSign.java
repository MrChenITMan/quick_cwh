package com.cwh.quick.web.security;

/**
 * 角色标识配置类，
 * 与role_info角色表中的role_sign字段相对应使用
 * <p>
 * Created by cwh on 2016/7/26.
 */
public class RoleSign
{
    /**
     *普通后台管理员
     */
    public static final String ADMIN = "admin";

    /**
     * 客户经理标识
     */
    public static final String CONSULTANT = "consultant";

    /**
     * VIP客户标识
     */
    public static final String VIP_USER = "vip_user";

    /**
     * 商家标识
     */
    public static final String MERCHANT = "merchant";

    /**
     *添加更多
     */
}