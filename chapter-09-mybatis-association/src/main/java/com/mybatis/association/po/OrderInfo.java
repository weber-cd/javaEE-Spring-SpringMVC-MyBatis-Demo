package com.mybatis.association.po;

public class OrderInfo {
    private String id;
    private String userId;
    private String number;

    public String getId() {
        return id;
    }

    public String getUserId() {
        return userId;
    }

    public String getNumber() {
        return number;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUserId(String name) {
        this.userId = name;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "OrderInfo{" +
                "id='" + id + '\'' +
                ", userId='" + userId + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
