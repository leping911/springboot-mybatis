package com.zlp.springboot.mapper;


import com.zlp.springboot.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户管理持久层
 * @author Louis
 *
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
	User getUserByUserName(String usr_name);
}
