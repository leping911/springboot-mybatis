package com.zlp.springboot.service;

import java.util.List;

import com.zlp.springboot.entity.UserGroup;
import com.zlp.springboot.mapper.UserGroupMapper;
import com.zlp.springboot.utils.Page;
import com.zlp.springboot.utils.Params;
import com.zlp.springboot.vi.LoginUserProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户组管理service层
 * @author Louis
 *
 */
@Service
public class UserGroupService extends BaseService<UserGroup>{
	
	@Autowired
	UserGroupMapper userGroupMapper;
	/**
	 * 插入用户组
	 * @param userGroup
	 * @param prof
	 * @return
	 */
	public long insert(UserGroup userGroup,LoginUserProfile prof){
		userGroup.setUsg_create_timestamp(getDate());
		userGroup.setUsg_create_usr_id(prof.getUsr_id());
		return userGroupMapper.insert(userGroup);
	}
	
	/**
	 * 更新用户组
	 * @param userGroup
	 * @param prof
	 * @return
	 */
	public long update(UserGroup userGroup,LoginUserProfile prof){
		userGroup.setUsg_update_timestamp(getDate());
		userGroup.setUsg_update_usr_id(prof.getUsr_id());
		return userGroupMapper.update(userGroup);
	}
	
	/**
	 * 删除用户组
	 * @param userGroup
	 * @return
	 */
	public long delete(UserGroup userGroup){
		return userGroupMapper.delete(userGroup.getUsg_id());
	}
	
	/**
	 * 按条件查询数据
	 * @param params
	 * @return
	 */
	public List<UserGroup> select(Params params){
		return userGroupMapper.list(params.getParams());
	}
	
	/**
	 * 分页数据
	 * @param page 分页对象
	 */
	public void select(Page<UserGroup> page){
		userGroupMapper.page(page);
	}
}
