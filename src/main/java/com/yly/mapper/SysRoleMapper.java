package com.yly.mapper;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.ibatis.annotations.Param;

import com.yly.domain.SysRole;
import com.yly.vo.EasyUIParamVo;

public interface SysRoleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysRole record);

    int insertSelective(SysRole record);

    SysRole selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysRole record);

    int updateByPrimaryKey(SysRole record);
    /**
     * 
     * @Description 根据用户ID获取角色
     * @param staffId
     * @return
     */
    Set<SysRole> queryRolesByStaffId(@Param("staffId")Long staffId);
    
    /**
     * @Description 获取总记录数
     * @date 2017年8月25日 上午10:59:05
     * @param map
     * @return 
     */
    Number queryRoleCountByConditions(@Param("map") Map<String, Object> map);

    /**
     * @Description 获取记录
     * @date 2017年8月24日 上午11:04:17
     * @param easyVo
     * @param map
     * @return 
     */
    List<SysRole> queryRoleByConditions(@Param("easyVo") EasyUIParamVo easyVo, @Param("map") Map<String, Object> map);
    Set<SysRole> queryRolesByUserId(Long userId);
}