package com.zlp.springboot.controller.admin;

import com.zlp.springboot.entity.User;
import com.zlp.springboot.service.UserService;
import com.zlp.springboot.vo.LoginProfile;
import com.zlp.springboot.vo.ResultJson;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;



@Api(value = "admin/user", description = "群组的相关操作")
@Controller
@RequestMapping("admin/user")
public class UserController {
	
	@Autowired
	UserService userService;

	@GetMapping("")
	public Map<String, Object> index() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("success", true);
		return map;
	}

	@ApiOperation(value="更新用户详细信息", notes="根据url的id来指定更新对象，并根据传过来的user信息来更新用户详细信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "prof", value = "用户ID", required = true, dataType = "LoginProfile"),
            @ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "User")
    })

	@PostMapping("insert")
	public ResultJson<User> insert(User user, LoginProfile prof) {
		ResultJson<User> resultJson = new ResultJson();
		if(user != null && user.getUsr_name() != null) {
			userService.insert(user, prof);
		}
		if(user != null && user.getUsr_id() > 0) {
			resultJson.setSuccess(true);
			resultJson.setData(user);
		} else {
			resultJson.setSuccess(false);
		}
		return resultJson;
	}
}
