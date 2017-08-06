/**
 * 
 */
package com.zlp.springboot.service;

import com.zlp.springboot.mapper.BaseMapper;
import com.zlp.springboot.utils.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;
import java.util.Map;


/**
 * 
 * @author Louis
 *
 * @param <T>
 */
@Service
public class BaseService<T> {

	@Autowired
	BaseMapper<T> baseMapper;
	
	public Page<T> page(Page<T> page){
		page.setResults(baseMapper.page(page));
		return page;
	}
	
	public void update(T t) {
		baseMapper.update(t);
	}

	public T get(Object id) {
		return baseMapper.get(id);
	}

	public void add(T t) {
		baseMapper.insert(t);
	}

	public void delete(long id) {
		baseMapper.delete(id);
	}

	public List<T> list(Map<String,Object> map) {
		return baseMapper.list(map);
	}
	
	public Timestamp getDate() {
		return baseMapper.getDate();
	}
	
}
