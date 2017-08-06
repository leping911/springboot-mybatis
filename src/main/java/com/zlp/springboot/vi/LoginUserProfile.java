package com.zlp.springboot.vi;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 用户实体类
 * 
 * @author Louis
 *
 */
public class LoginUserProfile implements Serializable {
	private static final long serialVersionUID = 1L;
	private long usr_id;
	private String usr_name;
	private String usr_password;
	private String usr_nickname;
	private String usr_email;
	private String usr_tel;
	private String usr_real_name;
	private String usr_idcard;
	private String usr_sex;
	private Timestamp usr_create_timestamp;
	private long usr_create_usr_id;
	private Timestamp usr_update_timestamp;
	private long usr_update_usr_id;

	public long getUsr_id() {
		return usr_id;
	}

	public void setUsr_id(long usr_id) {
		this.usr_id = usr_id;
	}

	public String getUsr_name() {
		return usr_name;
	}

	public void setUsr_name(String usr_name) {
		this.usr_name = usr_name;
	}

	public String getUsr_password() {
		return usr_password;
	}

	public void setUsr_password(String usr_password) {
		this.usr_password = usr_password;
	}

	public String getUsr_nickname() {
		return usr_nickname;
	}

	public void setUsr_nickname(String usr_nickname) {
		this.usr_nickname = usr_nickname;
	}

	public String getUsr_email() {
		return usr_email;
	}

	public void setUsr_email(String usr_email) {
		this.usr_email = usr_email;
	}

	public String getUsr_tel() {
		return usr_tel;
	}

	public void setUsr_tel(String usr_tel) {
		this.usr_tel = usr_tel;
	}

	public String getUsr_real_name() {
		return usr_real_name;
	}

	public void setUsr_real_name(String usr_real_name) {
		this.usr_real_name = usr_real_name;
	}

	public String getUsr_idcard() {
		return usr_idcard;
	}

	public void setUsr_idcard(String usr_idcard) {
		this.usr_idcard = usr_idcard;
	}

	public String getUsr_sex() {
		return usr_sex;
	}

	public void setUsr_sex(String usr_sex) {
		this.usr_sex = usr_sex;
	}

	public Timestamp getUsr_create_timestamp() {
		return usr_create_timestamp;
	}

	public void setUsr_create_timestamp(Timestamp usr_create_timestamp) {
		this.usr_create_timestamp = usr_create_timestamp;
	}

	public long getUsr_create_usr_id() {
		return usr_create_usr_id;
	}

	public void setUsr_create_usr_id(long usr_create_usr_id) {
		this.usr_create_usr_id = usr_create_usr_id;
	}

	public Timestamp getUsr_update_timestamp() {
		return usr_update_timestamp;
	}

	public void setUsr_update_timestamp(Timestamp usr_update_timestamp) {
		this.usr_update_timestamp = usr_update_timestamp;
	}

	public long getUsr_update_usr_id() {
		return usr_update_usr_id;
	}

	public void setUsr_update_usr_id(long usr_update_usr_id) {
		this.usr_update_usr_id = usr_update_usr_id;
	}
}
