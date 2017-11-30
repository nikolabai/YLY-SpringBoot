package com.yly.service.impl;

import static org.hamcrest.CoreMatchers.nullValue;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.base.CaseFormat;
import com.yly.domain.SysRole;
import com.yly.mapper.SysRoleMapper;
import com.yly.service.RoleService;
import com.yly.vo.EasyUIParamVo;
import com.yly.vo.EasyUIReturnVo;

/**
 * @author yuanhongqiu
 * @Description 角色service的实现类
 * @date 2017年07月26日 下午11:11
 **/
@Service
public class RoleServiceImpl implements RoleService{

    @Autowired
    private SysRoleMapper RoleMapper;

    @Override
    public EasyUIReturnVo<?> getRoleList(EasyUIParamVo easyVo, Map<String, Object> paramMap) {
        if (StringUtils.isNotBlank(easyVo.getSort())) {
            easyVo.setSort(CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, easyVo.getSort()));
        }
        Number total = this.RoleMapper.queryRoleCountByConditions(paramMap);
        List<SysRole> list = this.RoleMapper.queryRoleByConditions(easyVo, paramMap);
        return new EasyUIReturnVo<SysRole>(total, list);
    }
    
    @Override
    public Set<SysRole> getRolesByUserId(Long userId){
        return RoleMapper.queryRolesByUserId(userId);
    }
    @Override
    public List<SysRole> getRolesByUserId2(Long userId){
    	return null;
    }
    @Override
    public Set<String> getRolesStringByUserId(Long userId){
    	return null;
    }
}


