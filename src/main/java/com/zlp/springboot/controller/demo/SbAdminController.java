package com.zlp.springboot.controller.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * sb-admin demo控制器
 */
@Controller
@RequestMapping("demo/sb-admin")
public class SbAdminController {
    /**
     * sb-admin视图映射
     * @param page
     * @return
     */
    @GetMapping("{page}")
    public String index(@PathVariable(name = "page") String page) {
        return "demo/sb-admin/" + page;
    }
}
