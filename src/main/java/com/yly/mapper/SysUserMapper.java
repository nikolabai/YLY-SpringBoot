package com.yly.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.yly.domain.SysUser;
import com.yly.vo.EasyUIParamVo;

public interface SysUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);
    SysUser findUserByUserName(@Param("userName") String userName);

    SysUser SysUser(Map<String,Object> map);

	Integer updateLastLoginTime(SysUser user);
	SysUser findUserBypassword(Map<String,Object> map);
	
	 /**
     * @author anngiu
     * @Description 获取总记录数
     * @date 2017年8月25日 上午10:59:05
     * @param map
     * @return 
     */
    Number queryStaffCountByConditions(@Param("map") Map<String, Object> map);

    /**
     * @author anngiu
     * @Description 获取记录
     * @date 2017年8月24日 上午11:04:17
     * @param easyVo
     * @param map
     * @return 
     */
    List<SysUser> queryStaffByConditions(@Param("easyVo") EasyUIParamVo easyVo, @Param("map") Map<String, Object> map);
}