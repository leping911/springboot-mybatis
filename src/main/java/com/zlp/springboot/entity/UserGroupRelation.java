package com.zlp.springboot.entity;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 用户和用户组关系
 * 
 * @author Louis
 *
 */
public class UserGroupRelation implements Serializable {
	private static final long serialVersionUID = 1L;
	private long ugr_usr_id;
	private long ugr_usg_id;
	private long ugr_order;
	private Boolean ugr_parent_ind;
	private Timestamp ugr_create_timestamp;
	private long ugr_create_usr_id;

	public long getUgr_usr_id() {
		return ugr_usr_id;
	}

	public void setUgr_usr_id(long ugr_usr_id) {
		this.ugr_usr_id = ugr_usr_id;
	}

	public long getUgr_usg_id() {
		return ugr_usg_id;
	}

	public void setUgr_usg_id(long ugr_usg_id) {
		this.ugr_usg_id = ugr_usg_id;
	}

	public long getUgr_order() {
		return ugr_order;
	}

	public void setUgr_order(long ugr_order) {
		this.ugr_order = ugr_order;
	}

	public Boolean getUgr_parent_ind() {
		return ugr_parent_ind;
	}

	public void setUgr_parent_ind(Boolean ugr_parent_ind) {
		this.ugr_parent_ind = ugr_parent_ind;
	}

	public Timestamp getUgr_create_timestamp() {
		return ugr_create_timestamp;
	}

	public void setUgr_create_timestamp(Timestamp ugr_create_timestamp) {
		this.ugr_create_timestamp = ugr_create_timestamp;
	}

	public long getUgr_create_usr_id() {
		return ugr_create_usr_id;
	}

	public void setUgr_create_usr_id(long ugr_create_usr_id) {
		this.ugr_create_usr_id = ugr_create_usr_id;
	}
}
