package com.zlp.springboot.controller;


import com.zlp.springboot.web.exception.MyException;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

/**
 * Created by Administrator on 2017/7/6.
 */
@RestController
@RequestMapping("/index")
@Api("测试swagger")
public class HelloController {

    @GetMapping("")
    @ResponseBody
    @ApiIgnore
    public String index() throws Exception {
        return "index";
    }


    @GetMapping("/exception")
    @ApiIgnore
    public String exception() throws Exception {
        throw new Exception("Exception");
    }

    @ApiOperation(value="自定义异常", notes="自定义异常")
    /*@ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "User")*/
    @GetMapping("/myException")
    public String myException() throws MyException {
        throw new MyException("MyException");
    }
}
