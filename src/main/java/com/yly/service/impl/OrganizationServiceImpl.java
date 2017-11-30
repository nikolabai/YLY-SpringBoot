/******************************************************************
 *
 *
 *    Package:     com.suncity.baijiabang.admin.service.impl
 *
 *    Filename:    OrganizationServiceImpl.java
 *
 *    Description: 组织机构service实现类
 *
 *    Copyright:   Copyright (c) 2017
 *
 *    Company:     BJB
 *
 *    @author:     anngiu1
 *
 *    @version:    1.0.0
 *
 *    Create at:   2017年8月24日 上午12:01:37
 *
 *    Revision:
 *
 *    2017年8月24日 上午12:01:37
 *        - first revision
 *
 *****************************************************************/
package com.yly.service.impl;

import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.base.CaseFormat;
import com.yly.domain.Organization;
import com.yly.mapper.OrganizationMapper;
import com.yly.service.OrganizationService;
import com.yly.vo.EasyUIParamVo;
import com.yly.vo.EasyUIReturnVo;


/**
 * @ClassName OrganizationServiceImpl
 * @Description 组织机构service实现类
 * @author anngiu
 * @Date 2017年8月24日 上午12:01:37
 * @version 1.0.0
 */
@Service
public class OrganizationServiceImpl implements OrganizationService {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(OrganizationServiceImpl.class);
    
    @Autowired
    private OrganizationMapper organizationMapper;

    @Override
    public EasyUIReturnVo<?> getOrganizationList(EasyUIParamVo easyVo, Map<String, Object> paramMap) {
        if (StringUtils.isNotBlank(easyVo.getSort())) {
            easyVo.setSort(CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, easyVo.getSort()));
        }
        Number total = this.organizationMapper.queryOrganizationCountByConditions(paramMap);
        List<Organization> list = this.organizationMapper.queryOrganizationByConditions(easyVo, paramMap);
        return new EasyUIReturnVo<Organization>(total, list);
    }
    
//    @Override
//    public ResponseVo<Object> getOrgTree(Boolean isDeleted){
//        List<Organization> list = this.organizationMapper.selectAll();
//        //没有机构信息，异常
//        if (list == null || list.isEmpty()) {
//            LOGGER.error("获取机构信息异常：机构信息不存在！");
//            throw new BaiException(ReturnUtils.errorResponseVo("获取机构信息异常：机构信息不存在！"));
//        }
//        //TODO
//        return ReturnUtils.successResponseVo(list);
//    }

}
