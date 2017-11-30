package com.yly.mapper;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.ibatis.annotations.Param;

import com.yly.domain.SysPermission;
import com.yly.vo.EasyUIParamVo;

public interface SysPermissionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysPermission record);

    int insertSelective(SysPermission record);

    SysPermission selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysPermission record);

    int updateByPrimaryKeyWithBLOBs(SysPermission record);

    int updateByPrimaryKey(SysPermission record);
    /**
     * 
     * @Description 根据角色id获取资源
     * @param roleId
     * @return
     */
    Set<SysPermission> queryPermissionByRoleId(@Param("roleId")Long roleId);
    
    /**
     * @author anngiu
     * @Description 获取总记录数
     * @date 2017年8月25日 上午10:59:05
     * @param map
     * @return 
     */
    Number queryPermissionCountByConditions(@Param("map") Map<String, Object> map);

    /**
     * @author anngiu
     * @Description 获取记录
     * @date 2017年8月24日 上午11:04:17
     * @param easyVo
     * @param map
     * @return 
     */
    List<SysPermission> queryPermissionByConditions(@Param("easyVo") EasyUIParamVo easyVo, @Param("map") Map<String, Object> map);
}