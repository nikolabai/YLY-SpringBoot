package com.yly.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.yly.domain.Organization;
import com.yly.vo.EasyUIParamVo;

public interface OrganizationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Organization record);

    int insertSelective(Organization record);

    Organization selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Organization record);

    int updateByPrimaryKey(Organization record);
    
    
    Number queryOrganizationCountByConditions(@Param("map") Map<String, Object> map);
    List<Organization> queryOrganizationByConditions(@Param("easyVo") EasyUIParamVo easyVo, @Param("map") Map<String, Object> map);
}