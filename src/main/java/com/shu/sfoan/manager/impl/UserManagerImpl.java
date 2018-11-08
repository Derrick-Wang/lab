package com.shu.sfoan.manager.impl;

import com.shu.sfoan.dao.model.User;
import com.shu.sfoan.manager.UserManager;
import com.shu.sfoan.service.impl.UserServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by dongyang.wang on 2018/11/8 0008.
 */
@Service
@Slf4j
public class UserManagerImpl implements UserManager {

    @Autowired
    private UserServiceImpl userService;

    @Override
    public User getUserByName(String name) {
        return userService.getUserByName(name);
    }
}
