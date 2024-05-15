package com.mybatiscore.po;


import java.math.BigDecimal;

public class User {
    private Integer id;
    private String name;
    private String pwd;
    private BigDecimal deposit;

    public Integer getId() {
        return id;
    }

    public Number getDeposit() {
        return deposit;
    }

    public String getName() {
        return name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setDeposit(BigDecimal deposit) {
        this.deposit = deposit;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", deposit=" + deposit +
                '}';
    }
}
