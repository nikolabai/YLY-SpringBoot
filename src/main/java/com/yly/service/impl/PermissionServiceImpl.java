/******************************************************************
 *
 *    Package:     com.suncity.baijiabang.service.shiro
 *
 *    Filename:    ResourceServiceImple.java
 *
 *    Description: 资源serice实现类
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
package com.yly.service.impl;


import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.base.CaseFormat;
import com.yly.domain.SysPermission;
import com.yly.mapper.SysPermissionMapper;
import com.yly.service.PermissionService;
import com.yly.vo.EasyUIParamVo;
import com.yly.vo.EasyUIReturnVo;

/**
 * @ClassName RbacPermissionServiceImpl
 * @Description 资源serice实现类
 * @author anngiu
 * @Date 2017年7月13日 上午11:09:30
 * @version 1.0.0
 */
@Service
public class PermissionServiceImpl implements PermissionService{
    
    @Autowired
    private SysPermissionMapper PermissionMapper;

    @Override
    public EasyUIReturnVo<?> getPermissionList(EasyUIParamVo easyVo, Map<String, Object> paramMap) {
        if (StringUtils.isNotBlank(easyVo.getSort())) {
            easyVo.setSort(CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, easyVo.getSort()));
        }
        Number total = this.PermissionMapper.queryPermissionCountByConditions(paramMap);
        List<SysPermission> list = this.PermissionMapper.queryPermissionByConditions(easyVo, paramMap);
        return new EasyUIReturnVo<SysPermission>(total, list);
    }
    
    @Override
    public Set<SysPermission> queryPermissionByRoleId(Long roleId){
        return PermissionMapper.queryPermissionByRoleId(roleId);
    }
    @Override
    public Set<String> queryPermissionsByRoleId(Long roleId){
    	return null;
    }

}


