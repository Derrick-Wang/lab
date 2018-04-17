package com.shu.sfoan.service.impl;

import com.shu.sfoan.dao.mapper.EquipmentMapper;
import com.shu.sfoan.dao.model.Equipment;
import com.shu.sfoan.dao.model.EquipmentExample;
import com.shu.sfoan.service.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dongyang.wang on 2018/3/24 0024 .
 */
@Service
public class EquipmentServiceImpl implements EquipmentService{

    @Autowired
    public EquipmentMapper equipmentMapper;
    @Autowired
    public EquipmentExample equipmentExample;
    @Override
    public boolean insert(Equipment equipment) {
        return equipmentMapper.insert(equipment) > 0 ? true:false;
    }

    @Override
    public Equipment selectByName(String equName) {
        equipmentExample.clear();
        equipmentExample.createCriteria().andEquNameEqualTo(equName);
        List<Equipment> equipmentList = equipmentMapper.selectByExample(equipmentExample);
        return equipmentList.size()>0?equipmentList.get(0):null;
    }
}
