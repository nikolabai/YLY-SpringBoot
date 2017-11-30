/******************************************************************
 *
 *    Package:     com.suncity.baijiabang.service.shiro
 *
 *    Filename:    UserServiceImpl.java
 *
 *    Description: TODO(用一句话描述该文件做什么)
 *
 *    Copyright:   Copyright (c) 2017-2018
 *
 *    @author:     anngiu
 *
 *    @version:    1.0.0
 *
 *    Create at:   2017年7月13日 上午12:01:50
 *
 *    Revision:
 *
 *    2017年7月13日 上午12:01:50
 *        - first revision
 *
 *****************************************************************/
package com.yly.service.impl;

import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.base.CaseFormat;
import com.yly.domain.SysUser;
import com.yly.mapper.SysUserMapper;
import com.yly.service.UserService;
import com.yly.vo.EasyUIParamVo;
import com.yly.vo.EasyUIReturnVo;

/**
 * @ClassName UserServiceImpl
 * @Description 用户service的实现类
 * @author anngiu
 * @Date 2017年7月13日 上午12:01:50
 * @version 1.0.0
 */
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private SysUserMapper userMapper;

    @Override
    public EasyUIReturnVo<?> getStaffList(EasyUIParamVo easyVo, Map<String, Object> paramMap) {
        if (StringUtils.isNotBlank(easyVo.getSort())) {
            easyVo.setSort(CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, easyVo.getSort()));
        }
        Number total = this.userMapper.queryStaffCountByConditions(paramMap);
        List<SysUser> list = this.userMapper.queryStaffByConditions(easyVo, paramMap);
        return new EasyUIReturnVo<SysUser>(total, list);
    }


	@Override
	public SysUser findUserBypassword(Map<String,Object> map){
		return userMapper.findUserBypassword(map);
	}

	@Override
	public Integer updateLastLoginTime(SysUser staff){
		return userMapper.updateLastLoginTime(staff);
	}

	@Override
	public SysUser findUserByUserName(String username) {
		SysUser staff =  userMapper.findUserByUserName(username);
		return staff;
	}

}
