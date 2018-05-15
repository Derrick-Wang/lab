package com.shu.sfoan.dao.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class User {
    private Integer id;

    private Integer userId;

    private String userPetname;

    private String userName;

    private String userPass;

    private String userPhone;

    private String userEmail;

    private Integer userGrade;

    private Integer userStatus;

}