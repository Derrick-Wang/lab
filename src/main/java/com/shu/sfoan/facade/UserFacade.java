package com.shu.sfoan.facade;

import com.shu.sfoan.dao.model.User;

/**
 * Created by dongyang.wang on 2018/11/8 0008.
 */
public interface UserFacade {
    User getUserByName(String name);
}
