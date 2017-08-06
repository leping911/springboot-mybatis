/**
 * 
 */
package com.zlp.springboot.mapper;

import com.zlp.springboot.utils.Page;
import org.apache.ibatis.annotations.Mapper;

import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author Louis
 *
 * @param <T>
 */
@Mapper
public interface BaseMapper<T> {
	
	public T get(Object id);
	
	public List<T> page(Page<T> page);
	
	public long update(T t);
	
	public long insert(T t);
	
	public long delete(long id);
	
	public List<T> list(Map<String, Object> map);
	
	public Timestamp getDate();
	
}
