package com.zlp.springboot.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

/**
 * 功能菜单
 * 
 * @author Louis
 *
 */
public class Function implements Serializable {
	private static final long serialVersionUID = 1L;
	private long ftn_id;
	private String ftn_name;
	private String ftn_ext_id;
	private String ftn_url;
	private String ftn_type;
	private long ftn_order;
	private String ftn_status;
	private long ftn_level;
	private Timestamp ftn_create_timestamp;
	private long ftn_create_usr_id;
	private Timestamp ftn_update_timestamp;
	private long ftn_update_usr_id;
	private List<Function> functionList;

	public long getFtn_id() {
		return ftn_id;
	}

	public void setFtn_id(long ftn_id) {
		this.ftn_id = ftn_id;
	}

	public String getFtn_name() {
		return ftn_name;
	}

	public void setFtn_name(String ftn_name) {
		this.ftn_name = ftn_name;
	}

	public String getFtn_ext_id() {
		return ftn_ext_id;
	}

	public void setFtn_ext_id(String ftn_ext_id) {
		this.ftn_ext_id = ftn_ext_id;
	}

	public String getFtn_url() {
		return ftn_url;
	}

	public void setFtn_url(String ftn_url) {
		this.ftn_url = ftn_url;
	}

	public String getFtn_type() {
		return ftn_type;
	}

	public void setFtn_type(String ftn_type) {
		this.ftn_type = ftn_type;
	}

	public long getFtn_order() {
		return ftn_order;
	}

	public void setFtn_order(long ftn_order) {
		this.ftn_order = ftn_order;
	}

	public String getFtn_status() {
		return ftn_status;
	}

	public void setFtn_status(String ftn_status) {
		this.ftn_status = ftn_status;
	}

	public long getFtn_level() {
		return ftn_level;
	}

	public void setFtn_level(long ftn_level) {
		this.ftn_level = ftn_level;
	}

	public Timestamp getFtn_create_timestamp() {
		return ftn_create_timestamp;
	}

	public void setFtn_create_timestamp(Timestamp ftn_create_timestamp) {
		this.ftn_create_timestamp = ftn_create_timestamp;
	}

	public long getFtn_create_usr_id() {
		return ftn_create_usr_id;
	}

	public void setFtn_create_usr_id(long ftn_create_usr_id) {
		this.ftn_create_usr_id = ftn_create_usr_id;
	}

	public Timestamp getFtn_update_timestamp() {
		return ftn_update_timestamp;
	}

	public void setFtn_update_timestamp(Timestamp ftn_update_timestamp) {
		this.ftn_update_timestamp = ftn_update_timestamp;
	}

	public long getFtn_update_usr_id() {
		return ftn_update_usr_id;
	}

	public void setFtn_update_usr_id(long ftn_update_usr_id) {
		this.ftn_update_usr_id = ftn_update_usr_id;
	}

	public List<Function> getFunctionList() {
		return functionList;
	}

	public void setFunctionList(List<Function> functionList) {
		this.functionList = functionList;
	}
}
