package com.wbu.entity;

public class TnlDept {
    private Integer deptId;

    private String depyName;

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getDepyName() {
        return depyName;
    }

    public void setDepyName(String depyName) {
        this.depyName = depyName == null ? null : depyName.trim();
    }
}