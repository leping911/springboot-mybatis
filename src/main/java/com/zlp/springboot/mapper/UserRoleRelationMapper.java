package com.zlp.springboot.mapper;

import com.zlp.springboot.entity.UserRoleRelation;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户角色关系持久层
 * 
 * @author Louis
 *
 */
@Mapper
public interface UserRoleRelationMapper extends BaseMapper<UserRoleRelation> {
	public long deleteByUser(@Param("urr_usr_id") long urr_usr_id);
}
