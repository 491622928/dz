package com.example.demo.model;

import java.util.Date;

public class Order {
    private Integer orderId;

    private String orderCode;

    private Date orderCreTim;

    private Date orderStaTim;

    private Date orderEndTim;

    private Integer orderRental;

    private Integer orderRoom;

    private Integer orderUse;

    private Integer orderType;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode == null ? null : orderCode.trim();
    }

    public Date getOrderCreTim() {
        return orderCreTim;
    }

    public void setOrderCreTim(Date orderCreTim) {
        this.orderCreTim = orderCreTim;
    }

    public Date getOrderStaTim() {
        return orderStaTim;
    }

    public void setOrderStaTim(Date orderStaTim) {
        this.orderStaTim = orderStaTim;
    }

    public Date getOrderEndTim() {
        return orderEndTim;
    }

    public void setOrderEndTim(Date orderEndTim) {
        this.orderEndTim = orderEndTim;
    }

    public Integer getOrderRental() {
        return orderRental;
    }

    public void setOrderRental(Integer orderRental) {
        this.orderRental = orderRental;
    }

    public Integer getOrderRoom() {
        return orderRoom;
    }

    public void setOrderRoom(Integer orderRoom) {
        this.orderRoom = orderRoom;
    }

    public Integer getOrderUse() {
        return orderUse;
    }

    public void setOrderUse(Integer orderUse) {
        this.orderUse = orderUse;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }
}