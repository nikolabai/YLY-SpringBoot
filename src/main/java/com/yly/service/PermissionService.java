/******************************************************************
 *
 *    Package:     com.suncity.baijiabang.api.shiro
 *
 *    Filename:    ResourceService.java
 *
 *    Description: 资源serice
 *
 *    Copyright:   Copyright (c) 2017-2018
 *
 *    @author:     anngiu
 *
 *    @version:    1.0.0
 *
 *    Create at:   2017年7月13日 上午11:09:30
 *
 *    Revision:
 *
 *    2017年7月13日 上午11:09:30
 *        - first revision
 *
 *****************************************************************/
package com.yly.service;


import java.util.Map;
import java.util.Set;

import com.yly.domain.SysPermission;
import com.yly.vo.EasyUIParamVo;
import com.yly.vo.EasyUIReturnVo;



/**
 * @ClassName RbacPermissionService
 * @Description 资源serice
 * @author anngiu
 * @Date 2017年7月13日 上午11:09:30
 * @version 1.0.0
 */
public interface PermissionService {
    
    /**
     * 
     * @Description 获取资源列表
     * @param easyVo
     * @param paramMap
     * @return
     */
    EasyUIReturnVo<?> getPermissionList(EasyUIParamVo easyVo,Map<String,Object> paramMap);

    /**
     * 
     * @Description 根据角色id查询资源权限
     * @param roleId
     * @return
     */
    Set<SysPermission> queryPermissionByRoleId(Long roleId);
    Set<String> queryPermissionsByRoleId(Long roleId);
}
