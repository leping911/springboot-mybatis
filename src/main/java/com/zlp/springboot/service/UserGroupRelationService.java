package com.zlp.springboot.service;

import java.sql.Timestamp;
import java.util.List;

import com.zlp.springboot.entity.UserGroup;
import com.zlp.springboot.entity.UserGroupRelation;
import com.zlp.springboot.mapper.UserGroupMapper;
import com.zlp.springboot.mapper.UserGroupRelationMapper;
import com.zlp.springboot.vo.LoginProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户、用户组关系service层
 * 
 * @author Louis
 *
 */
@Service
public class UserGroupRelationService extends BaseService<UserGroupRelation> {

	@Autowired
	UserGroupRelationMapper userGroupRelationMapper;

	@Autowired
	UserGroupMapper userGroupMapper;

	/**
	 * 插入用户、用户组关系
	 * 
	 * @param userGroupRelation
	 * @param prof
	 * @return
	 */
	public long insert(long ugr_usr_id, long ugr_usg_id, LoginProfile prof) {
		List<UserGroup> userGroupList = userGroupMapper.getParentGroupList(ugr_usg_id);
		UserGroupRelation userGroupRelation = null;
		Timestamp cur_time = getDate();
		long order = 1l;
		if (userGroupList != null && userGroupList.size() > 0) {
			for (int i = 0; i < userGroupList.size(); i++) {
				UserGroup userGroup = userGroupList.get(i);
				if(userGroup != null && userGroup.getUsg_id() > 0) {
					userGroupRelation = new UserGroupRelation();
					userGroupRelation.setUgr_usr_id(ugr_usr_id);
					userGroupRelation.setUgr_usg_id(userGroupList.get(i).getUsg_id());
					userGroupRelation.setUgr_order(order);
					userGroupRelation.setUgr_parent_ind(false);
					userGroupRelation.setUgr_create_timestamp(cur_time);
					userGroupRelation.setUgr_create_usr_id(prof.getUsr_id());
					userGroupRelationMapper.insert(userGroupRelation);
					order++;
				}
			}
		}
		userGroupRelation = new UserGroupRelation();
		userGroupRelation.setUgr_usr_id(ugr_usr_id);
		userGroupRelation.setUgr_usg_id(ugr_usg_id);
		userGroupRelation.setUgr_order(order);
		userGroupRelation.setUgr_parent_ind(true);
		userGroupRelation.setUgr_create_timestamp(cur_time);
		userGroupRelation.setUgr_create_usr_id(prof.getUsr_id());
		userGroupRelationMapper.insert(userGroupRelation);
		return order;
	}

	/**
	 * 删除用户、用户组关系
	 * 
	 * @param userGroupRelation
	 * @return
	 */
	public long delete(UserGroupRelation userGroupRelation) {
		return userGroupRelationMapper.deleteByUser(userGroupRelation.getUgr_usr_id());
	}
}
