package com.shu.sfoan.service;

import com.shu.sfoan.dao.model.BookEqu;
import com.shu.sfoan.dao.model.User;

import java.util.List;

/**
 * Created by dongyang.wang on 2018/3/23 0023 .
 */
public interface BookEquService {
    boolean insert(BookEqu bookEqu);
    List<BookEqu> selectByUsername(String userName);
    List<BookEqu> selectByEquname(String equName);
    List<BookEqu> selectByBooktime(int booktime);


}
