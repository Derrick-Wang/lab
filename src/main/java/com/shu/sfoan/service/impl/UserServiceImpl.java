package com.shu.sfoan.service.impl;

import com.shu.sfoan.common.service.BaseServiceImpl;
import com.shu.sfoan.dao.mapper.UserMapper;
import com.shu.sfoan.dao.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by dongyang.wang on 2018/3/23 0023 .
 */

@Service
public class UserServiceImpl extends BaseServiceImpl{

    @Autowired
    private UserMapper getUserMapper(){ return (UserMapper) this.baseMapper;}

    public User getUserByName(String name) {
        User user = new User();
        user.setUserName(name);

        return this.getUserMapper().selectOne(user);
    }
}
