package com.yly.mapper;

import com.yly.domain.SysRolePermission;
import org.apache.ibatis.annotations.Param;

public interface SysRolePermissionMapper {
    int deleteByPrimaryKey(@Param("roleId") Long roleId, @Param("permissionId") Long permissionId);

    int insert(SysRolePermission record);

    int insertSelective(SysRolePermission record);

    SysRolePermission selectByPrimaryKey(@Param("roleId") Long roleId, @Param("permissionId") Long permissionId);

    int updateByPrimaryKeySelective(SysRolePermission record);

    int updateByPrimaryKey(SysRolePermission record);
}