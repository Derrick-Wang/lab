package com.shu.sfoan.service;

import com.shu.sfoan.dao.model.Equipment;

/**
 * Created by dongyang.wang on 2018/3/23 0023 .
 */
public interface EquipmentService {
    boolean insert(Equipment equipment);
    Equipment selectByName(String equName);
}
