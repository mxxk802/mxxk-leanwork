package cn.com.mxxk.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserController
 *
 * @auther zhang
 * @date 2021/4/11
 **/
@RestController
public class UserController {

    @RequestMapping("/index")
    public String show(){
        return "哈哈";
    }
}
