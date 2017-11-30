package com.yly.mapper;

import com.yly.domain.SysUserRole;
import org.apache.ibatis.annotations.Param;

public interface SysUserRoleMapper {
    int deleteByPrimaryKey(@Param("staffId") Long staffId, @Param("roleId") Long roleId);

    int insert(SysUserRole record);

    int insertSelective(SysUserRole record);

    SysUserRole selectByPrimaryKey(@Param("staffId") Long staffId, @Param("roleId") Long roleId);

    int updateByPrimaryKeySelective(SysUserRole record);

    int updateByPrimaryKey(SysUserRole record);
}