package com.heqq.model;

public class User {
    private Integer id;

    private Integer dageId;

    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDageId() {
        return dageId;
    }

    public void setDageId(Integer dageId) {
        this.dageId = dageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}