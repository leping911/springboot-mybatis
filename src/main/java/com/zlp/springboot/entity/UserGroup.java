package com.zlp.springboot.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Map;

/**
 * 用户组
 * 
 * @author Louis
 *
 */
public class UserGroup implements Serializable {
	private static final long serialVersionUID = 1L;
	private long usg_id;
	private String usg_name;
	private String usg_code;
	private String usg_type;
	private String usg_status;
	private String usg_desc;
	private String usg_source;
	private Timestamp usg_create_timestamp;
	private long usg_create_usr_id;
	private Timestamp usg_update_timestamp;
	private long usg_update_usr_id;
	private Map<Long, User> userManagerMap;

	public long getUsg_id() {
		return usg_id;
	}

	public void setUsg_id(long usg_id) {
		this.usg_id = usg_id;
	}

	public String getUsg_name() {
		return usg_name;
	}

	public void setUsg_name(String usg_name) {
		this.usg_name = usg_name;
	}

	public String getUsg_code() {
		return usg_code;
	}

	public void setUsg_code(String usg_code) {
		this.usg_code = usg_code;
	}

	public String getUsg_type() {
		return usg_type;
	}

	public void setUsg_type(String usg_type) {
		this.usg_type = usg_type;
	}

	public String getUsg_status() {
		return usg_status;
	}

	public void setUsg_status(String usg_status) {
		this.usg_status = usg_status;
	}

	public String getUsg_desc() {
		return usg_desc;
	}

	public void setUsg_desc(String usg_desc) {
		this.usg_desc = usg_desc;
	}

	public String getUsg_source() {
		return usg_source;
	}

	public void setUsg_source(String usg_source) {
		this.usg_source = usg_source;
	}

	public Timestamp getUsg_create_timestamp() {
		return usg_create_timestamp;
	}

	public void setUsg_create_timestamp(Timestamp usg_create_timestamp) {
		this.usg_create_timestamp = usg_create_timestamp;
	}

	public long getUsg_create_usr_id() {
		return usg_create_usr_id;
	}

	public void setUsg_create_usr_id(long usg_create_usr_id) {
		this.usg_create_usr_id = usg_create_usr_id;
	}

	public Timestamp getUsg_update_timestamp() {
		return usg_update_timestamp;
	}

	public void setUsg_update_timestamp(Timestamp usg_update_timestamp) {
		this.usg_update_timestamp = usg_update_timestamp;
	}

	public long getUsg_update_usr_id() {
		return usg_update_usr_id;
	}

	public void setUsg_update_usr_id(long usg_update_usr_id) {
		this.usg_update_usr_id = usg_update_usr_id;
	}

	public Map<Long, User> getUserManagerMap() {
		return userManagerMap;
	}

	public void setUserManagerMap(Map<Long, User> userManagerMap) {
		this.userManagerMap = userManagerMap;
	}
}
