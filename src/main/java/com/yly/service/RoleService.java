/******************************************************************
 *
 *
 *    Package:     com.suncity.baijiabang.admin.service
 *
 *    Filename:    RbacRoleService.java
 *
 *    Description: 角色service
 *
 *    Copyright:   Copyright (c) 2017
 *
 *    Company:     BJB
 *
 *    @author:     anngiu1
 *
 *    @version:    1.0.0
 *
 *    Create at:   2017年8月23日 下午11:59:45
 *
 *    Revision:
 *
 *    2017年8月23日 下午11:59:45
 *        - first revision
 *
 *****************************************************************/
package com.yly.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.yly.domain.SysRole;
import com.yly.vo.EasyUIParamVo;
import com.yly.vo.EasyUIReturnVo;



/**
 * @ClassName RbacRoleService
 * @Description 角色service
 * @author anngiu
 * @Date 2017年8月23日 下午11:59:45
 * @version 1.0.0
 */
public interface RoleService {
    
    /**
     * 
     * @Description 获取角色列表
     * @param easyVo
     * @param paramMap
     * @return
     */
    EasyUIReturnVo<?> getRoleList(EasyUIParamVo easyVo,Map<String,Object> paramMap);
    
    /**
     * 
     * @Description 根据用户id查询角色
     * @param staffId
     * @return
     */
    Set<SysRole> getRolesByUserId(Long userId);
    List<SysRole> getRolesByUserId2(Long userId);
    Set<String> getRolesStringByUserId(Long userId);
}
