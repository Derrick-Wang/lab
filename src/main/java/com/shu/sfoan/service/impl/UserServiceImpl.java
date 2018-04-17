package com.shu.sfoan.service.impl;

import com.shu.sfoan.dao.mapper.UserMapper;
import com.shu.sfoan.dao.model.User;
import com.shu.sfoan.dao.model.UserExample;
import com.shu.sfoan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by dongyang.wang on 2018/3/23 0023 .
 */

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    public UserMapper userMapper;
    @Autowired
    public UserExample userExample;

    @Override
    public boolean insert(User user) {
        return userMapper.insert(user) > 0 ? true:false;
    }

    @Override
    public User selectByName(String userName) {
        userExample.clear();
        userExample.createCriteria().andUserNameEqualTo(userName);
        List<User> userList = userMapper.selectByExample(userExample);
        return userList.size()>0?userList.get(0):null;
    }

    public String get() {
        int value = 0;
        try {
            System.out.println("try……");

            //等式1/0 ：分母为0 的明显错误          ——制造错误（用于抛异常）
            int result = 1 / 1;

            return "111";

        } catch (Exception e) {
            System.out.println("catch……");
//		return "444";
        }
		/*finally {
			System.out.println("finally……");
			return "333";
		}*/

       return "222";
    }
}
