package com.shu.sfoan.service;

import com.shu.sfoan.dao.model.User;

/**
 * Created by dongyang.wang on 2018/3/23 0023 .
 */

public interface UserService {
    boolean insert(User user);
    User selectByName(String userName);
}
