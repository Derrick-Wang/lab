package com.shu.sfoan.dao.mapper;

import com.shu.sfoan.dao.model.Equipment;
import com.shu.sfoan.dao.model.EquipmentExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EquipmentMapper {
    int countByExample(EquipmentExample example);

    int deleteByExample(EquipmentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Equipment record);

    int insertSelective(Equipment record);

    List<Equipment> selectByExample(EquipmentExample example);

    Equipment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Equipment record, @Param("example") EquipmentExample example);

    int updateByExample(@Param("record") Equipment record, @Param("example") EquipmentExample example);

    int updateByPrimaryKeySelective(Equipment record);

    int updateByPrimaryKey(Equipment record);
}