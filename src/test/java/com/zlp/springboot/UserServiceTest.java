package com.zlp.springboot;

import com.zlp.springboot.entity.User;
import com.zlp.springboot.service.UserService;
import com.zlp.springboot.vo.LoginProfile;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Administrator on 2017/8/6.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {
    @Autowired
    private UserService userService;

    @Test
    @Rollback
    public void findByName() throws Exception {
        User user = new User();
        user.setUsr_name("user01");
        LoginProfile prof = new LoginProfile();
        prof.setUsr_id(1);
        userService.insert(user, prof);
    }
}
