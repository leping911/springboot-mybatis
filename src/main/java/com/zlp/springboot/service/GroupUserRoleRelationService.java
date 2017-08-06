package com.zlp.springboot.service;

import com.zlp.springboot.entity.GroupUserRoleRelation;
import com.zlp.springboot.mapper.GroupUserRoleRelationMapper;
import com.zlp.springboot.vi.LoginUserProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户管理用户组关系service层
 * 
 * @author Louis
 *
 */
@Service
public class GroupUserRoleRelationService extends BaseService<GroupUserRoleRelation> {

	@Autowired
	GroupUserRoleRelationMapper groupUserRoleRelationMapper;

	/**
	 * 插入用户管理用户组关系
	 * 
	 * @param groupUserRoleRelation
	 * @param prof
	 * @return
	 */
	public long insert(long gur_usg_id, long gur_rol_id, long gur_usr_id, LoginUserProfile prof) {
		GroupUserRoleRelation groupUserRoleRelation = new GroupUserRoleRelation();
		groupUserRoleRelation.setGur_usg_id(gur_usg_id);
		groupUserRoleRelation.setGur_rol_id(gur_rol_id);
		groupUserRoleRelation.setGur_usr_id(gur_usr_id);
		groupUserRoleRelation.setGur_create_timestamp(getDate());
		groupUserRoleRelation.setGur_create_usr_id(prof.getUsr_id());
		return groupUserRoleRelationMapper.insert(groupUserRoleRelation);
	}

	/**
	 * 删除用户用户组管理关系
	 * 
	 * @param groupUserRoleRelation
	 * @return
	 */
	public long delete(GroupUserRoleRelation groupUserRoleRelation) {
		return groupUserRoleRelationMapper.deleteByGroup(groupUserRoleRelation.getGur_usg_id());
	}
}
