package com.shu.sfoan.controller;

import com.shu.sfoan.service.impl.BookEquServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by dongyang.wang on 2018/3/24 0024 .
 */
@RestController
public class BookEquController {
    @Autowired
    public BookEquServiceImpl bookEquService;

    @RequestMapping(value = "/findBookequByUsername")
    @ResponseBody
    public String findBookequByUsername(@RequestParam(value = "name")String name) {
        return bookEquService.selectByUsername(name).toString();
    }
    @RequestMapping(value = "/findBookequByEquname")
    @ResponseBody
    public String findBooequByEquname(@RequestParam(value = "name")String name) {
        return bookEquService.selectByEquname(name).toString();
    }
    @RequestMapping(value = "/findBookequByBookname")
    @ResponseBody
    public String findBooequByBookname(@RequestParam(value = "booktime") int booktime) {
        return bookEquService.selectByBooktime(booktime).toString();
    }
}
