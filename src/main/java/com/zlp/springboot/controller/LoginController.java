package com.zlp.springboot.controller;

import com.zlp.springboot.entity.User;
import com.zlp.springboot.service.UserService;
import com.zlp.springboot.utils.Md5;
import com.zlp.springboot.vo.LoginProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by lenovo on 2017/8/7.
 */
@Controller
@RequestMapping("login")
@ApiIgnore
public class LoginController {

    @Autowired
    UserService userService;

    @GetMapping("")
    public String login() {
        return "login";
    }

    @PostMapping("")
    public String loginAction(Model model, HttpSession session, @ModelAttribute User user, HttpServletRequest request) {
        session.invalidate();
        session = request.getSession(true);
        if(user != null && user.getUsr_name() != null && user.getUsr_password() != null) {
            User userData = userService.getUserByUserName(user.getUsr_name());
            String ciphertext = Md5.EncoderByMd5(user.getUsr_password());
            if(userData.getUsr_password().equals(ciphertext)) {
                LoginProfile prof = new LoginProfile();
                prof.copy(userData);
                session.setAttribute(LoginProfile.AUTH_LOGIN_PROFILE, prof);
            }
        }
        return "redirect:/index";
    }

    @GetMapping("out")
    public String loginOut(HttpSession session) {
        session.invalidate();
        return "login";
    }
}
