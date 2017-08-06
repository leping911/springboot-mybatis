package com.zlp.springboot.mapper;

import com.zlp.springboot.entity.GroupUserRoleRelation;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


/**
 * 用户管理用户组关系持久层
 * 
 * @author Louis
 *
 */
@Mapper
public interface GroupUserRoleRelationMapper extends BaseMapper<GroupUserRoleRelation> {
	public long deleteByGroup(@Param("gur_usg_id") long gur_usg_id);
}
