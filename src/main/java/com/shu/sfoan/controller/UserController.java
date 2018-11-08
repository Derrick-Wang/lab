package com.shu.sfoan.controller;

import com.shu.sfoan.dao.model.User;
import com.shu.sfoan.facade.UserFacade;
import com.shu.sfoan.service.impl.UserServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by dongyang.wang on 2018/3/24 0024 .
 */
@Api(description = "用户接口")
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    public UserFacade userFacade;

    @ApiOperation(value = "查询用户" ,  notes="查询用户")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "用户名", required = true, paramType = "query", dataType = "String")
    })
    @RequestMapping(value="/queryUser",method= RequestMethod.POST)
    public String findUser(@RequestParam(value = "name") String name){
        User user = userFacade.getUserByName(name);
        return user.toString();
    }

}