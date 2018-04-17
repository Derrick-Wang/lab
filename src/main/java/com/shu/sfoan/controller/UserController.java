package com.shu.sfoan.controller;

import com.shu.sfoan.dao.model.User;
import com.shu.sfoan.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dongyang.wang on 2018/3/24 0024 .
 */
@RestController
public class UserController {
    @Autowired
    public UserServiceImpl userService;

    @RequestMapping(value = "/findUser")
    @ResponseBody
    public String findUser(@RequestParam(value = "name") String name){
        User user = userService.selectByName(name);
        return user.toString();
    }

}
