package com.zlp.springboot.service;

import java.util.List;

import com.zlp.springboot.entity.User;
import com.zlp.springboot.mapper.UserMapper;
import com.zlp.springboot.utils.Page;
import com.zlp.springboot.utils.Params;
import com.zlp.springboot.vi.LoginUserProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户service层
 * @author Louis
 *
 */
@Service
public class UserService extends BaseService<User>{
	
	@Autowired
	UserMapper userMapper;
	/**
	 * 插入用户
	 * @param user
	 * @param prof
	 * @return
	 */
	public long insert(User user,LoginUserProfile prof){
		user.setUsr_create_timestamp(getDate());
		user.setUsr_create_usr_id(prof.getUsr_id());
		return userMapper.insert(user);
	}
	
	/**
	 * 更新用户
	 * @param user
	 * @param prof
	 * @return
	 */
	public long update(User user,LoginUserProfile prof){
		user.setUsr_update_timestamp(getDate());
		user.setUsr_update_usr_id(prof.getUsr_id());
		return userMapper.update(user);
	}
	
	/**
	 * 删除用户
	 * @param user
	 * @return
	 */
	public long delete(User user){
		return userMapper.delete(user.getUsr_id());
	}
	
	/**
	 * 按条件查询数据
	 * @param params
	 * @return
	 */
	public List<User> select(Params params){
		return userMapper.list(params.getParams());
	}
	
	/**
	 * 分页数据
	 * @param page 分页对象
	 */
	public void select(Page<User> page){
		userMapper.page(page);
	}
}
