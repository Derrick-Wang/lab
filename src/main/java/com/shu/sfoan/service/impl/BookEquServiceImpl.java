package com.shu.sfoan.service.impl;

import com.shu.sfoan.dao.mapper.BookEquMapper;
import com.shu.sfoan.dao.model.BookEqu;
import com.shu.sfoan.dao.model.BookEquExample;
import com.shu.sfoan.dao.model.Equipment;
import com.shu.sfoan.dao.model.User;
import com.shu.sfoan.service.BookEquService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dongyang.wang on 2018/3/24 0024 .
 */
@Service
public class BookEquServiceImpl implements BookEquService {

    @Autowired
    public BookEquMapper bookEquMapper;
    @Autowired
    public BookEquExample bookEquExample;
    @Autowired
    public UserServiceImpl userService;
    @Autowired
    public EquipmentServiceImpl equipmentService;

    @Override
    public boolean insert(BookEqu bookEqu) {
        return bookEquMapper.insert(bookEqu) > 0 ? true:false;
    }

    @Override
    public List<BookEqu> selectByUsername(String userName) {
        User user = userService.selectByName(userName);
        if(user==null){
            return null;
        }else {
            bookEquExample.clear();
            bookEquExample.createCriteria().andUserIdEqualTo(user.getId());
            List<BookEqu> bookEquList = bookEquMapper.selectByExample(bookEquExample);
            return bookEquList;
        }
    }

    @Override
    public List<BookEqu> selectByEquname(String equName) {
        Equipment equipment = equipmentService.selectByName(equName);
        if(equipment==null){
            return null;
        }else {
            bookEquExample.clear();
            bookEquExample.createCriteria().andEquIdEqualTo(equipment.getId());
            List<BookEqu> bookEquList = bookEquMapper.selectByExample(bookEquExample);
            return bookEquList;
        }
    }

    @Override
    public List<BookEqu> selectByBooktime(int booktime) {
        bookEquExample.clear();
        bookEquExample.createCriteria().andBookTimeEqualTo(booktime);
        List<BookEqu> bookEquList = bookEquMapper.selectByExample(bookEquExample);
        return bookEquList;
    }
}
