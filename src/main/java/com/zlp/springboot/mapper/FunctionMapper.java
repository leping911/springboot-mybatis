package com.zlp.springboot.mapper;

import com.zlp.springboot.entity.Function;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户管理持久层
 * @author Louis
 *
 */
@Mapper
public interface FunctionMapper extends BaseMapper<Function> {
	
}
