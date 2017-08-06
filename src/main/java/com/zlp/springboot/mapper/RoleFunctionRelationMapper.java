package com.zlp.springboot.mapper;

import com.zlp.springboot.entity.RoleFunctionRelation;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Mapper;


/**
 * 角色功能菜单关系持久层
 * 
 * @author Louis
 *
 */
@Mapper
public interface RoleFunctionRelationMapper extends BaseMapper<RoleFunctionRelation> {
	public long deleteByRole(@Param("rfr_rol_id") long rfr_rol_id);
}
