package com.zlp.springboot.entity;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 角色功能菜单关系
 * 
 * @author Louis
 *
 */
public class UserRoleRelation implements Serializable {
	private static final long serialVersionUID = 1L;
	private long urr_usr_id;
	private long urr_rol_id;
	private Timestamp urr_create_timestamp;
	private long urr_create_usr_id;

	public long getUrr_usr_id() {
		return urr_usr_id;
	}

	public void setUrr_usr_id(long urr_usr_id) {
		this.urr_usr_id = urr_usr_id;
	}

	public long getUrr_rol_id() {
		return urr_rol_id;
	}

	public void setUrr_rol_id(long urr_rol_id) {
		this.urr_rol_id = urr_rol_id;
	}

	public Timestamp getUrr_create_timestamp() {
		return urr_create_timestamp;
	}

	public void setUrr_create_timestamp(Timestamp urr_create_timestamp) {
		this.urr_create_timestamp = urr_create_timestamp;
	}

	public long getUrr_create_usr_id() {
		return urr_create_usr_id;
	}

	public void setUrr_create_usr_id(long urr_create_usr_id) {
		this.urr_create_usr_id = urr_create_usr_id;
	}

}
