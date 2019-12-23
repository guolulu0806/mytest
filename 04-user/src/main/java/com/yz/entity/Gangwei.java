package com.yz.entity;

import java.util.Date;

public class Gangwei {
    private Integer id;

    private String gangweiName;

    private String gangweiCode;

    private Integer order;

    private String gangweiType;

    private Date updateTime;

    private String beizhu;

    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGangweiName() {
        return gangweiName;
    }

    public void setGangweiName(String gangweiName) {
        this.gangweiName = gangweiName == null ? null : gangweiName.trim();
    }

    public String getGangweiCode() {
        return gangweiCode;
    }

    public void setGangweiCode(String gangweiCode) {
        this.gangweiCode = gangweiCode == null ? null : gangweiCode.trim();
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public String getGangweiType() {
        return gangweiType;
    }

    public void setGangweiType(String gangweiType) {
        this.gangweiType = gangweiType == null ? null : gangweiType.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu == null ? null : beizhu.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}