package com.zlp.springboot.controller;

import com.zlp.springboot.entity.User;
import com.zlp.springboot.service.UserService;
import com.zlp.springboot.vi.LoginUserProfile;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;



@Api(value = "/group", description = "群组的相关操作")
@Controller
@RequestMapping("user")
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
            @ApiImplicitParam(name = "prof", value = "用户ID", required = true, dataType = "LoginUserProfile"),
            @ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "User")
    })
	@PostMapping("insert")
	public Map<String, Object> insert(@ModelAttribute( "user" )User user, LoginUserProfile prof) {
		Map<String, Object> map = new HashMap<String, Object>();
		if(prof == null) {
			prof = new LoginUserProfile();
		}
		userService.insert(user, prof);
		if(user != null && user.getUsr_id() > 0) {
			map.put("success", true);
			map.put("usr_id", user.getUsr_id());
		} else {
			map.put("success", false);
		}
		return map;
	}
}
