package com.shu.sfoan.dao.model;

import java.util.Date;

public class BookEqu {
    private Integer id;

    private Integer userId;

    private Integer equId;

    private Integer bookTime;

    private Date createTime;

    private String statement;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getEquId() {
        return equId;
    }

    public void setEquId(Integer equId) {
        this.equId = equId;
    }

    public Integer getBookTime() {
        return bookTime;
    }

    public void setBookTime(Integer bookTime) {
        this.bookTime = bookTime;
    }

    public Date getCreateTime() {

        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement == null ? null : statement.trim();
    }

    @Override
    public String toString() {
        return "BookEqu{" +
                "id=" + id +
                ", userId=" + userId +
                ", equId=" + equId +
                ", bookTime=" + bookTime +
                ", createTime=" + createTime +
                ", statement='" + statement + '\'' +
                '}';
    }
}