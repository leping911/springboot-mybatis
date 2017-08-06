package com.zlp.springboot.service;

import com.zlp.springboot.entity.RoleFunctionRelation;
import com.zlp.springboot.mapper.RoleFunctionRelationMapper;
import com.zlp.springboot.vi.LoginUserProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 角色功能菜单关系service层
 * 
 * @author Louis
 *
 */
@Service
public class RoleFunctionRelationService extends BaseService<RoleFunctionRelation> {

	@Autowired
	RoleFunctionRelationMapper roleFunctionRelationMapper;

	/**
	 * 插入角色功能菜单关系
	 * 
	 * @param roleFunctionRelation
	 * @param prof
	 * @return
	 */
	public long insert(long rfr_rol_id, long rfr_ftn_id, LoginUserProfile prof) {
		RoleFunctionRelation roleFunctionRelation = new RoleFunctionRelation();
		roleFunctionRelation.setRfr_rol_id(rfr_rol_id);
		roleFunctionRelation.setRfr_ftn_id(rfr_ftn_id);
		roleFunctionRelation.setRfr_create_timestamp(getDate());
		roleFunctionRelation.setRfr_create_usr_id(prof.getUsr_id());
		return roleFunctionRelationMapper.insert(roleFunctionRelation);
	}

	/**
	 * 删除角色功能菜单关系
	 * 
	 * @param roleFunctionRelation
	 * @return
	 */
	public long delete(RoleFunctionRelation roleFunctionRelation) {
		return roleFunctionRelationMapper.deleteByRole(roleFunctionRelation.getRfr_rol_id());
	}
}
