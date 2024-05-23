package com.mybatis.association.po;

public class Address {

    private Integer id;
    private String userId;
    private String address;
    private String city;
    private String street;

    public Integer getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public String getUserId() {
        return userId;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setUserId(String userId) {
        userId = userId;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", UserId='" + userId + '\'' +
                '}';
    }
}
