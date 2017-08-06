package com.zlp.springboot.entity;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 用户部门管理关系
 * 
 * @author Louis
 *
 */
public class GroupUserRoleRelation implements Serializable {
	private static final long serialVersionUID = 1L;
	private long gur_usg_id;
	private long gur_usr_id;
	private long gur_rol_id;
	private Timestamp gur_create_timestamp;
	private long gur_create_usr_id;

	public long getGur_usg_id() {
		return gur_usg_id;
	}

	public void setGur_usg_id(long gur_usg_id) {
		this.gur_usg_id = gur_usg_id;
	}

	public long getGur_usr_id() {
		return gur_usr_id;
	}

	public void setGur_usr_id(long gur_usr_id) {
		this.gur_usr_id = gur_usr_id;
	}

	public long getGur_rol_id() {
		return gur_rol_id;
	}

	public void setGur_rol_id(long gur_rol_id) {
		this.gur_rol_id = gur_rol_id;
	}

	public Timestamp getGur_create_timestamp() {
		return gur_create_timestamp;
	}

	public void setGur_create_timestamp(Timestamp gur_create_timestamp) {
		this.gur_create_timestamp = gur_create_timestamp;
	}

	public long getGur_create_usr_id() {
		return gur_create_usr_id;
	}

	public void setGur_create_usr_id(long gur_create_usr_id) {
		this.gur_create_usr_id = gur_create_usr_id;
	}

}
