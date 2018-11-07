package com.shu.sfoan.common.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Created by dongyang.wang on 2018/11/7 0007.
 */
public interface CustomMapper <T> extends Mapper<T>, MySqlMapper<T> {
}
