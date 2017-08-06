package com.zlp.springboot.mapper;

import com.zlp.springboot.entity.Role;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户管理持久层
 * @author Louis
 *
 */
@Mapper
public interface RoleMapper extends BaseMapper<Role> {
	
}
