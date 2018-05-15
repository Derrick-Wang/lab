package com.shu.sfoan.lab;

import com.shu.sfoan.dao.model.BookEqu;
import com.shu.sfoan.dao.model.Equipment;
import com.shu.sfoan.dao.model.User;
import com.shu.sfoan.service.impl.BookEquServiceImpl;
import com.shu.sfoan.service.impl.EquipmentServiceImpl;
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
	@Autowired
	public EquipmentServiceImpl equipmentService;
	@Autowired
	public BookEquServiceImpl bookEquService;
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
	public void equipmentinsert(){
		Equipment equipment = new Equipment();
//		equipment.setId(2);							//* ID
		equipment.setEquId("11001221");				//* 设备编号
		equipment.setEquName("拉锥机");				//* 设备名称
		equipment.setEquType(3);					//* 设备类型（1:耗材2:公用3:贵重）
		equipment.setEquPrice("120000");			//  设备价格
		equipment.setOwner(3);						//* 所属老师ID
		equipment.setEquKeeper(2);					//* 保管人ID
		equipment.setBuyingDate("2009-05-11");		//  购买时间
		equipment.setApplyingDate("2009-03-21");	//  开始使用时间
		equipment.setTotalTime(3414);				//  总使用时间
		equipment.setEquStatus(1);					//  设备状态（1:使用中2:维修中3:损坏）
		equipment.setEquLocation("106");		//* 设备所在地
		equipment.setStatement("小心使用");			//  声明
		equipmentService.insert(equipment);
	}
	@Test
	public void bookEquinsert(){
		BookEqu bookEqu = new BookEqu();
//		bookEqu.setId(3);					//*
		bookEqu.setEquId(3);				//* 设备ID
		bookEqu.setUserId(4);				//* 使用者ID
		bookEqu.setBookTime(2);				//* 预约时间
		bookEqu.setCreateTime(new Date());	//* 创建时间
		bookEqu.setStatement("不可以取消");	//  说明
		bookEquService.insert(bookEqu);
	}
	@Test
	public void findUserByName(){
		User user = userService.selectByName("李四");
		System.out.println(user);
	}
	@Test
	public void findBookequByUsername(){
		List<BookEqu> bookEquList= bookEquService.selectByUsername("张");
		System.out.println(bookEquList);
	}
	@Test
	public void findBookequByEquname(){
		List<BookEqu> bookEquList= bookEquService.selectByEquname("光谱仪");
		BookEqu bookEqu = bookEquList.get(2);
		Date time = new Date();
		System.out.println((new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(time));
		System.out.println(bookEqu.getCreateTime());
		System.out.println(bookEquList);
	}
	@Test
	public void findBookequByBooktime(){
		List<BookEqu> bookEquList= bookEquService.selectByBooktime(3);
		System.out.println(bookEquList.get(0).getCreateTime());
	}
	@Test
	public void get(){
		System.out.println(userService.get());
	}
}
