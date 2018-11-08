package com.shu.sfoan.facade.impl;

import com.shu.sfoan.dao.model.User;
import com.shu.sfoan.facade.UserFacade;
import com.shu.sfoan.manager.UserManager;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by dongyang.wang on 2018/11/8 0008.
 */
@Service
@Slf4j
public class UserFacadeImpl implements UserFacade {
    @Autowired
    private UserManager userManager;

    @Override
    public User getUserByName(String name) {
        return userManager.getUserByName(name);
    }
}
