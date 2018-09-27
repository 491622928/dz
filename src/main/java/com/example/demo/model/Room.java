package com.example.demo.model;

public class Room {
    private Integer roomId;

    private String roomAddr;

    private Integer roomHold;

    private Integer roomUse;

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public String getRoomAddr() {
        return roomAddr;
    }

    public void setRoomAddr(String roomAddr) {
        this.roomAddr = roomAddr == null ? null : roomAddr.trim();
    }

    public Integer getRoomHold() {
        return roomHold;
    }

    public void setRoomHold(Integer roomHold) {
        this.roomHold = roomHold;
    }

    public Integer getRoomUse() {
        return roomUse;
    }

    public void setRoomUse(Integer roomUse) {
        this.roomUse = roomUse;
    }
}