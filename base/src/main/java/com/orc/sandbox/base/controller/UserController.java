package com.orc.sandbox.base.controller;

import com.orc.sandbox.base.entity.User;
import com.orc.sandbox.base.service.UserService;
import com.orc.sandbox.common.bo.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RequestMapping("/user")
@RestController
public class UserController extends BaseController{

    @Resource
    UserService userService;

    @GetMapping("/get/{id}")
    public Result get(@PathVariable("id") Integer id) {
        Result<User> rs = new Result<>();

        User user = new User();
        user.setId(233);
        user = userService.findByCondition(user).get(0);
        rs.setData(user);

        return rs;
    }


}
