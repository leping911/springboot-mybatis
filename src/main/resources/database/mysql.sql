/**
 * auth:louis
 * date:2016-08-28
 * desc:创建user表
 */
use louis;
create table user(
    usr_id int not null auto_increment,#id,自增长
    usr_name char(20) not null,#用户名
    usr_password char(32),#密码
    usr_nickname char(50),#昵称
    usr_email char(50),#邮箱
    usr_tel char(50),#电话号码
    usr_real_name char(50),#真实姓名
    usr_idcard char(20),#身份证号码
    usr_sex char(1),#性别
    usr_create_timestamp datetime,#创建时间
    usr_create_usr_id int,#创建人
    usr_update_timestamp datetime,#修改时间
    usr_update_usr_id int,#修改人
    primary key(usr_id)
);

/**
 * auth:louis
 * date:2016-08-30
 * desc:创建role表
 */
create table role(
    rol_id int not null auto_increment,#id自增长
    rol_name char(20) not null,#角色名称
    rol_url_home char(32),#角色主页
    rol_type char(50),#类型
    rol_defaul_ind int,#是否是默认角色
    rol_status char(50),#状态
    rol_level int,#级别
    rol_create_timestamp datetime,#创建时间
    rol_create_usr_id int,#创建人
    rol_update_timestamp datetime,#修改时间
    rol_update_usr_id int,#修改人
    primary key(rol_id)
);

/**
 * auth:louis
 * date:2016-08-30
 * desc:创建机构表
 */
create table UserGroup(
    usg_id int not null auto_increment,#id自增长
    usg_name char(100) not null,#名称
    usg_code char(50),#编号
    usg_type char(10),#类型
    usg_status char(10),#状态
    usg_desc char(255),#描述
    usg_source char(10),#来源
    usg_create_timestamp datetime,#创建时间
    usg_create_usr_id int,#创建人
    usg_update_timestamp datetime,#修改时间
    usg_update_usr_id int,#修改人
    primary key(usg_id)
);

/**
 * auth:louis
 * date:2016-08-30
 * desc:创建功能菜单表
 */
create table Function(
    ftn_id int not null auto_increment,#id自增长
    ftn_name char(50) not null,#名称
    ftn_ext_id char(50),#扩展id
    ftn_url char(50),#指向url
    ftn_type char(10),#类型
    ftn_order int,#排序
    ftn_status char(10),#状态
	ftn_level int,#级别
    ftn_create_timestamp datetime,#创建时间
    ftn_create_usr_id int,#创建人
    ftn_update_timestamp datetime,#修改时间
    ftn_update_usr_id int,#修改人
    primary key(ftn_id)
);

/**
 * auth:louis
 * date:2016-08-30
 * desc:创建用户机构关系表
 */
create table UserGroupRelation(
    ugr_usr_id int not null,#用户id
    ugr_usg_id int not null,#用户组id
    ugr_order int not null,#排序
    ugr_parent_ind int not null,#是否是直接用户组
    ugr_create_timestamp datetime,#创建时间
    ugr_create_usr_id int,#创建人
	primary key(ugr_usr_id,ugr_usg_id),
    FOREIGN KEY (ugr_usr_id) REFERENCES User(usr_id),
	FOREIGN KEY (ugr_usg_id) REFERENCES UserGroup(usg_id)
);

/**
 * auth:louis
 * date:2016-08-30
 * desc:创建角色功能菜单关系表
 */
create table RoleFunctionRelation(
    rfr_rol_id int not null,#角色id
    rfr_ftn_id int not null,#功能菜单id
    rfr_create_timestamp datetime,#创建时间
    rfr_create_usr_id int,#创建人
	primary key(rfr_rol_id,rfr_ftn_id),
    FOREIGN KEY (rfr_rol_id) REFERENCES Role(rol_id),
	FOREIGN KEY (rfr_ftn_id) REFERENCES Function(ftn_id)
);

/**
 * auth:louis
 * date:2016-08-30
 * desc:创建用户角色关系表
 */
create table UserRoleRelation(
    urr_usr_id int not null,#用户id
    urr_rol_id int not null,#角色id
    urr_create_timestamp datetime,#创建时间
    urr_create_usr_id int,#创建人
	primary key(urr_usr_id,urr_rol_id),
    FOREIGN KEY (urr_usr_id) REFERENCES User(usr_id),
	FOREIGN KEY (urr_rol_id) REFERENCES Role(rol_id)
);

/**
 * auth:louis
 * date:2016-08-30
 * desc:创建用户管理机构关系表
 */
create table GroupUserRoleRelation(
    gur_usg_id int not null,#用户组id
    gur_usr_id int not null,#用户id
    gur_rol_id int not null,#角色id
    gur_create_timestamp datetime,#创建时间
    gur_create_usr_id int,#创建人
	primary key(gur_usg_id,gur_usr_id,gur_rol_id),
    FOREIGN KEY (gur_usg_id) REFERENCES UserGroup(usg_id),
	FOREIGN KEY (gur_usr_id) REFERENCES User(usr_id),
	FOREIGN KEY (gur_rol_id) REFERENCES Role(rol_id)
);


insert into user(usr_name,usr_password,usr_nickname,usr_email,usr_tel,usr_real_name,usr_idcard,usr_sex,usr_create_timestamp) values('admin','admin','admin','admin@louis.com','admin','admin','admin','F',now());
