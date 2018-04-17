package com.shu.sfoan.dao.mapper;

import com.shu.sfoan.dao.model.BookEqu;
import com.shu.sfoan.dao.model.BookEquExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookEquMapper {
    int countByExample(BookEquExample example);

    int deleteByExample(BookEquExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BookEqu record);

    int insertSelective(BookEqu record);

    List<BookEqu> selectByExample(BookEquExample example);

    BookEqu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BookEqu record, @Param("example") BookEquExample example);

    int updateByExample(@Param("record") BookEqu record, @Param("example") BookEquExample example);

    int updateByPrimaryKeySelective(BookEqu record);

    int updateByPrimaryKey(BookEqu record);
}