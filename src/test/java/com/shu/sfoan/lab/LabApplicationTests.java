package com.shu.sfoan.lab;

import com.shu.sfoan.dao.model.User;
import com.shu.sfoan.service.impl.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LabApplicationTests {

	@Autowired
	public UserServiceImpl userService;

	@Test
	public void userinsert() {
		User user = new User();
//		user.setId(4);						//* ID
		user.setUserEmail("sdker@163.com");	//  邮箱
		user.setUserGrade(2);				//* 用户级别（1:学生2:老师3:管理员）
		user.setUserId(15721118);			//* 学号
		user.setUserName("赵六");			//* 姓名
		user.setUserPass("543332");			//* 密码
		user.setUserPetname("哈哈");		//  昵称
		user.setUserPhone("18800343421");	//  手机号
		user.setUserStatus(1);				//* 用户状态（1:正常2:冻结3:注销）
		userService.insert(user);			//*
	}

	@Test
	public void get(){
		System.out.println("2");
	}
}
