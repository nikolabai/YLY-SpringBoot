/******************************************************************
 *
 *
 *    Package:     com.suncity.baijiabang.admin.service
 *
 *    Filename:    OrganizationService.java
 *
 *    Description: 组织机构service
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

import java.util.Map;

import com.yly.vo.EasyUIParamVo;
import com.yly.vo.EasyUIReturnVo;



/**
 * @ClassName OrganizationService
 * @Description 组织机构service
 * @author anngiu
 * @Date 2017年8月23日 下午11:59:45
 * @version 1.0.0
 */
public interface OrganizationService {
    
    /**
     * 
     * @Description 获取组织机构列表
     * @param easyVo
     * @param paramMap
     * @return
     */
    EasyUIReturnVo<?> getOrganizationList(EasyUIParamVo easyVo,Map<String,Object> paramMap);
    
    
//    ResponseVo<Object> getOrgTree(Boolean isDeleted);

}
