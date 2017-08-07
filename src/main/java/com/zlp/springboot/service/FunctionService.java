package com.zlp.springboot.service;

import java.util.List;

import com.zlp.springboot.entity.Function;
import com.zlp.springboot.mapper.FunctionMapper;
import com.zlp.springboot.utils.Page;
import com.zlp.springboot.utils.Params;
import com.zlp.springboot.vo.LoginProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 功能菜单管理service层
 * @author Louis
 *
 */
@Service
public class FunctionService extends BaseService<Function>{
	
	@Autowired
	FunctionMapper functionMapper;
	/**
	 * 插入功能菜单
	 * @param function
	 * @param prof
	 * @return
	 */
	public long insert(Function function,LoginProfile prof){
		function.setFtn_create_timestamp(getDate());
		function.setFtn_create_usr_id(prof.getUsr_id());
		return functionMapper.insert(function);
	}
	
	/**
	 * 更新功能菜单
	 * @param function
	 * @param prof
	 * @return
	 */
	public long update(Function function,LoginProfile prof){
		function.setFtn_update_timestamp(getDate());
		function.setFtn_update_usr_id(prof.getUsr_id());
		return functionMapper.update(function);
	}
	
	/**
	 * 删除功能菜单
	 * @param function
	 * @return
	 */
	public long delete(Function function){
		return functionMapper.delete(function.getFtn_id());
	}
	
	/**
	 * 按条件查询数据
	 * @param params
	 * @return
	 */
	public List<Function> select(Params params){
		return functionMapper.list(params.getParams());
	}
	
	/**
	 * 分页数据
	 * @param page 分页对象
	 */
	public void select(Page<Function> page){
		functionMapper.page(page);
	}
}
