package com.cwh.quick.web.model;

import org.apache.ibatis.type.Alias;

/**
 * 权限模型
 *
 * Created by cwh on 2016/7/25.
 */
@Alias("Permission")
public class Permission {
    private Long id;

    private String permissionName;

    private String permissionSign;

    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName == null ? null : permissionName.trim();
    }

    public String getPermissionSign() {
        return permissionSign;
    }

    public void setPermissionSign(String permissionSign) {
        this.permissionSign = permissionSign == null ? null : permissionSign.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    @Override
    public String toString() {
        return "Permission [id=" + id + ", permissionName=" + permissionName + ", permissionSign=" + permissionSign + ", description=" + description + "]";
    }

}