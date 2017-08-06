package com.zlp.springboot.entity;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 角色
 * 
 * @author Louis
 *
 */
public class Role implements Serializable {
	private static final long serialVersionUID = 1L;
	private long rol_id;
	private String rol_name;
	private String rol_url_home;
	private String rol_type;
	private Boolean rol_defaul_ind;
	private String rol_status;
	private long rol_level;
	private Timestamp rol_create_timestamp;
	private long rol_create_usr_id;
	private Timestamp rol_update_timestamp;
	private long rol_update_usr_id;

	public long getRol_id() {
		return rol_id;
	}

	public void setRol_id(long rol_id) {
		this.rol_id = rol_id;
	}

	public String getRol_name() {
		return rol_name;
	}

	public void setRol_name(String rol_name) {
		this.rol_name = rol_name;
	}

	public String getRol_url_home() {
		return rol_url_home;
	}

	public void setRol_url_home(String rol_url_home) {
		this.rol_url_home = rol_url_home;
	}

	public String getRol_type() {
		return rol_type;
	}

	public void setRol_type(String rol_type) {
		this.rol_type = rol_type;
	}

	public Boolean getRol_defaul_ind() {
		return rol_defaul_ind;
	}

	public void setRol_defaul_ind(Boolean rol_defaul_ind) {
		this.rol_defaul_ind = rol_defaul_ind;
	}

	public String getRol_status() {
		return rol_status;
	}

	public void setRol_status(String rol_status) {
		this.rol_status = rol_status;
	}

	public long getRol_level() {
		return rol_level;
	}

	public void setRol_level(long rol_level) {
		this.rol_level = rol_level;
	}

	public Timestamp getRol_create_timestamp() {
		return rol_create_timestamp;
	}

	public void setRol_create_timestamp(Timestamp rol_create_timestamp) {
		this.rol_create_timestamp = rol_create_timestamp;
	}

	public long getRol_create_usr_id() {
		return rol_create_usr_id;
	}

	public void setRol_create_usr_id(long rol_create_usr_id) {
		this.rol_create_usr_id = rol_create_usr_id;
	}

	public Timestamp getRol_update_timestamp() {
		return rol_update_timestamp;
	}

	public void setRol_update_timestamp(Timestamp rol_update_timestamp) {
		this.rol_update_timestamp = rol_update_timestamp;
	}

	public long getRol_update_usr_id() {
		return rol_update_usr_id;
	}

	public void setRol_update_usr_id(long rol_update_usr_id) {
		this.rol_update_usr_id = rol_update_usr_id;
	}

}
