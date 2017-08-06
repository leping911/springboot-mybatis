package com.zlp.springboot.service;

import java.util.List;

import com.zlp.springboot.entity.Role;
import com.zlp.springboot.mapper.RoleMapper;
import com.zlp.springboot.utils.Page;
import com.zlp.springboot.utils.Params;
import com.zlp.springboot.vi.LoginUserProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 角色管理service层
 * @author Louis
 *
 */
@Service
public class RoleService extends BaseService<Role>{
	
	@Autowired
	RoleMapper roleMapper;
	/**
	 * 插入角色
	 * @param role
	 * @param prof
	 * @return
	 */
	public long insert(Role role,LoginUserProfile prof){
		role.setRol_create_timestamp(getDate());
		role.setRol_create_usr_id(prof.getUsr_id());
		return roleMapper.insert(role);
	}
	
	/**
	 * 更新角色
	 * @param role
	 * @param prof
	 * @return
	 */
	public long update(Role role,LoginUserProfile prof){
		role.setRol_update_timestamp(getDate());
		role.setRol_update_usr_id(prof.getUsr_id());
		return roleMapper.update(role);
	}
	
	/**
	 * 删除角色
	 * @param role
	 * @return
	 */
	public long delete(Role role){
		return roleMapper.delete(role.getRol_id());
	}
	
	/**
	 * 按条件查询数据
	 * @param params
	 * @return
	 */
	public List<Role> select(Params params){
		return roleMapper.list(params.getParams());
	}
	
	/**
	 * 分页数据
	 * @param page 分页对象
	 */
	public void select(Page<Role> page){
		roleMapper.page(page);
	}
}
