package com.zlp.springboot.service;

import com.zlp.springboot.entity.UserRoleRelation;
import com.zlp.springboot.mapper.UserRoleRelationMapper;
import com.zlp.springboot.vo.LoginProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * 用户、角色关系管理service层
 * 
 * @author Louis
 *
 */
@Service
public class UserRoleRelationService extends BaseService<UserRoleRelation> {

	@Autowired
	UserRoleRelationMapper userRoleRelationMapper;

	/**
	 * 插入用户、角色关系
	 * 
	 * @param userRoleRelation
	 * @param prof
	 * @return
	 */
	public long insert(long urr_usr_id, long urr_rol_id, LoginProfile prof) {
		UserRoleRelation userRoleRelation = new UserRoleRelation();
		userRoleRelation.setUrr_rol_id(urr_rol_id);
		userRoleRelation.setUrr_usr_id(urr_usr_id);
		userRoleRelation.setUrr_create_timestamp(getDate());
		userRoleRelation.setUrr_create_usr_id(prof.getUsr_id());
		return userRoleRelationMapper.insert(userRoleRelation);
	}

	/**
	 * 删除用户角色关系
	 * 
	 * @param userRoleRelation
	 * @return
	 */
	public long delete(UserRoleRelation userRoleRelation) {
		return userRoleRelationMapper.deleteByUser(userRoleRelation.getUrr_usr_id());
	}
}
