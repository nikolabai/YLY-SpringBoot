/******************************************************************
 *
 *    Package:     com.suncity.baijiabang.api.shiro
 *
 *    Filename:    UserService.java
 *
 *    Description: 用户serice
 *
 *    Copyright:   Copyright (c) 2017-2018
 *
 *    @author:     anngiu
 *
 *    @version:    1.0.0
 *
 *    Create at:   2017年7月12日 下午11:59:30
 *
 *    Revision:
 *
 *    2017年7月12日 下午11:59:30
 *        - first revision
 *
 *****************************************************************/
package com.yly.service;


import java.util.Map;

import com.yly.domain.SysUser;
import com.yly.vo.EasyUIParamVo;
import com.yly.vo.EasyUIReturnVo;


/**
 * @ClassName RbacStaffService
 * @Description 用户serice
 * @author anngiu
 * @Date 2017年7月12日 下午11:59:30
 * @version 1.0.0
 */
public interface UserService {
    
    /**
     * 
     * @Description 获取用户列表
     * @param easyVo
     * @param paramMap
     * @return
     */
    EasyUIReturnVo<?> getStaffList(EasyUIParamVo easyVo,Map<String,Object> paramMap);

    /**
     * 
     * @Description 根据条件查询用户
     * @param map
     * @return
     */
    SysUser findUserBypassword(Map<String,Object> map);

	/**
	 * 
	 * @Description 更新用户登录时间
	 * @param user
	 * @return
	 */
	Integer updateLastLoginTime(SysUser user);

	/**
	 * 
	 * @Description 根据用户名查询用户
	 * @param userName
	 * @return
	 */
	SysUser findUserByUserName(String userName);

}
