package com.orc.sandbox.base.controller;

import com.orc.sandbox.base.dao.UserDao;
import com.orc.sandbox.base.entity.User;
import com.orc.sandbox.base.service.UserService;
import com.orc.sandbox.common.bo.Result;
import com.orc.sandbox.common.util.ApplicationContextUtil;
import com.orc.sandbox.common.util.IdWorker;
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
    public Result get(@PathVariable("id") Long id) {
        Result<User> rs = new Result<>();
        IdWorker idWorker = new IdWorker(1, 1);
        User user = null;
        user = userService.getOne(id);
        rs.setData(user);

        return rs;
    }

    @GetMapping("/test")
    public Result test() {
        ApplicationContextUtil.getBean(UserDao.class);

        return new Result();
    }


}
