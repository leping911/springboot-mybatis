package com.zlp.springboot.mapper;

import com.zlp.springboot.entity.UserGroupRelation;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户管理持久层
 * 
 * @author Louis
 *
 */
@Mapper
public interface UserGroupRelationMapper extends BaseMapper<UserGroupRelation> {
	public long deleteByUser(@Param("ugr_usr_id") long ugr_usr_id);
}
