package com.shu.sfoan.dao.model;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEquId() {
        return equId;
    }

    public void setEquId(String equId) {
        this.equId = equId == null ? null : equId.trim();
    }

    public String getEquName() {
        return equName;
    }

    public void setEquName(String equName) {
        this.equName = equName == null ? null : equName.trim();
    }

    public Integer getEquType() {
        return equType;
    }

    public void setEquType(Integer equType) {
        this.equType = equType;
    }

    public String getEquPrice() {
        return equPrice;
    }

    public void setEquPrice(String equPrice) {
        this.equPrice = equPrice == null ? null : equPrice.trim();
    }

    public Integer getOwner() {
        return owner;
    }

    public void setOwner(Integer owner) {
        this.owner = owner;
    }

    public Integer getEquKeeper() {
        return equKeeper;
    }

    public void setEquKeeper(Integer equKeeper) {
        this.equKeeper = equKeeper;
    }

    public String getBuyingDate() {
        return buyingDate;
    }

    public void setBuyingDate(String buyingDate) {
        this.buyingDate = buyingDate == null ? null : buyingDate.trim();
    }

    public String getApplyingDate() {
        return applyingDate;
    }

    public void setApplyingDate(String applyingDate) {
        this.applyingDate = applyingDate == null ? null : applyingDate.trim();
    }

    public Integer getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(Integer totalTime) {
        this.totalTime = totalTime;
    }

    public Integer getEquStatus() {
        return equStatus;
    }

    public void setEquStatus(Integer equStatus) {
        this.equStatus = equStatus;
    }

    public String getEquLocation() {
        return equLocation;
    }

    public void setEquLocation(String equLocation) {
        this.equLocation = equLocation == null ? null : equLocation.trim();
    }

    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement == null ? null : statement.trim();
    }

    @Override
    public String toString() {
        return "Equipment{" +
                "id=" + id +
                ", equId='" + equId + '\'' +
                ", equName='" + equName + '\'' +
                ", equType=" + equType +
                ", equPrice='" + equPrice + '\'' +
                ", owner=" + owner +
                ", equKeeper=" + equKeeper +
                ", buyingDate='" + buyingDate + '\'' +
                ", applyingDate='" + applyingDate + '\'' +
                ", totalTime=" + totalTime +
                ", equStatus=" + equStatus +
                ", equLocation='" + equLocation + '\'' +
                ", statement='" + statement + '\'' +
                '}';
    }
}