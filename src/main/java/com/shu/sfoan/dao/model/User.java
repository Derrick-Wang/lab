package com.shu.sfoan.dao.model;

import com.shu.sfoan.common.model.BaseBean;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name="user_0")
public class User extends BaseBean{

    @Id
    @GeneratedValue(generator = "JDBC")
    @Column(name = "id")
    private Integer id;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "user_petname")
    private String userPetname;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "user_pass")
    private String userPass;

    @Column(name = "user_phone")
    private String userPhone;

    @Column(name = "user_email")
    private String userEmail;

    @Column(name = "user_grade")
    private Integer userGrade;

    @Column(name = "user_status")
    private Integer userStatus;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;


    @Override
    public void setCreateTime(Date date) {
        this.createTime = new Date();
    }

    @Override
    public void setUpdateTime(Date date) {
        this.updateTime = new Date();

    }
}