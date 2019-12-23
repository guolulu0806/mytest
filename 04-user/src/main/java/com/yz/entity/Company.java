package com.yz.entity;

import java.util.Date;

public class Company {
    private Integer id;

    private String companyName;

    private String companyQuanname;

    private Integer order;

    private String guishu;

    private Date updateTime;

    private String beizhu;

    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getCompanyQuanname() {
        return companyQuanname;
    }

    public void setCompanyQuanname(String companyQuanname) {
        this.companyQuanname = companyQuanname == null ? null : companyQuanname.trim();
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public String getGuishu() {
        return guishu;
    }

    public void setGuishu(String guishu) {
        this.guishu = guishu == null ? null : guishu.trim();
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