package com.shu.sfoan.dao.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Equipment {
    private Integer id;

    private String equId;

    private String equName;

    private Integer equType;

    private String equPrice;

    private Integer owner;

    private Integer equKeeper;

    private String buyingDate;

    private String applyingDate;

    private Integer totalTime;

    private Integer equStatus;

    private String equLocation;

    private String statement;

}