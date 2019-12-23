package com.yz.entity;

import java.util.Date;

public class Jigou {
    private Integer id;

    private String jigouName;

    private String jigouQuanname;

    private Integer order;

    private Integer jigouType;

    private Date updateTime;

    private String beizhu;

    private Integer status;

    private Integer companyid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJigouName() {
        return jigouName;
    }

    public void setJigouName(String jigouName) {
        this.jigouName = jigouName == null ? null : jigouName.trim();
    }

    public String getJigouQuanname() {
        return jigouQuanname;
    }

    public void setJigouQuanname(String jigouQuanname) {
        this.jigouQuanname = jigouQuanname == null ? null : jigouQuanname.trim();
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public Integer getJigouType() {
        return jigouType;
    }

    public void setJigouType(Integer jigouType) {
        this.jigouType = jigouType;
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

    public Integer getCompanyid() {
        return companyid;
    }

    public void setCompanyid(Integer companyid) {
        this.companyid = companyid;
    }
}