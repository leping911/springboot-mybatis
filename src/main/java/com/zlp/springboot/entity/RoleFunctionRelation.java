package com.zlp.springboot.entity;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 角色功能菜单关系
 * 
 * @author Louis
 *
 */
public class RoleFunctionRelation implements Serializable {
	private static final long serialVersionUID = 1L;
	private long rfr_rol_id;
	private long rfr_ftn_id;
	private Timestamp rfr_create_timestamp;
	private long rfr_create_usr_id;

	public long getRfr_rol_id() {
		return rfr_rol_id;
	}

	public void setRfr_rol_id(long rfr_rol_id) {
		this.rfr_rol_id = rfr_rol_id;
	}

	public long getRfr_ftn_id() {
		return rfr_ftn_id;
	}

	public void setRfr_ftn_id(long rfr_ftn_id) {
		this.rfr_ftn_id = rfr_ftn_id;
	}

	public Timestamp getRfr_create_timestamp() {
		return rfr_create_timestamp;
	}

	public void setRfr_create_timestamp(Timestamp rfr_create_timestamp) {
		this.rfr_create_timestamp = rfr_create_timestamp;
	}

	public long getRfr_create_usr_id() {
		return rfr_create_usr_id;
	}

	public void setRfr_create_usr_id(long rfr_create_usr_id) {
		this.rfr_create_usr_id = rfr_create_usr_id;
	}

}
