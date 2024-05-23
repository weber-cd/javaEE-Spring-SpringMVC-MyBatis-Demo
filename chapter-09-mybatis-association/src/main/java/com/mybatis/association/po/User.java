package com.mybatis.association.po;


import java.math.BigDecimal;

public class User {
    private Integer id;
    private String name;
    private String pwd;
    private BigDecimal deposit;
    private Address address;

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

    public Address getAddress() {
        return address;
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

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", deposit=" + deposit +
                ", address=" + address +
                '}';
    }
}
