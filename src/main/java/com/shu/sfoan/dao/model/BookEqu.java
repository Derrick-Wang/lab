package com.shu.sfoan.dao.model;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
public class BookEqu {
    private Integer id;

    private Integer userId;

    private Integer equId;

    private Integer bookTime;

    private Date createTime;

    private String statement;
}