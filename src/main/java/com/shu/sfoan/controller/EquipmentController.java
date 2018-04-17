package com.shu.sfoan.controller;

import com.shu.sfoan.service.impl.EquipmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
/**
 * Created by dongyang.wang on 2018/3/24 0024 .
 */
@RestController
public class EquipmentController {
    @Autowired
    public EquipmentServiceImpl equipmentService;

    @RequestMapping(value = "/findEqu")
    @ResponseBody
    public String findEqu(@RequestParam(value = "name")String name) {
        return equipmentService.selectByName(name).toString();
    }
}
