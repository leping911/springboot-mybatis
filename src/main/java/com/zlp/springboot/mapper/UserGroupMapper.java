package com.zlp.springboot.mapper;

import com.zlp.springboot.entity.UserGroup;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


/**
 * 用户管理持久层
 * 
 * @author Louis
 *
 */
@Mapper
public interface UserGroupMapper extends BaseMapper<UserGroup> {

	List<UserGroup> getParentGroupList(@Param("ugr_usg_id") long ugr_usg_id);

}
