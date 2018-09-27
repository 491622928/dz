package com.example.demo.model;

import java.util.Date;

public class File {
    private Integer fileId;

    private String fileName;

    private String fileUrl;

    private Date fileCreTim;

    private Integer fileRoom;

    private Integer fileOrder;

    private Integer fileUse;

    private Integer fileType;

    public Integer getFileId() {
        return fileId;
    }

    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl == null ? null : fileUrl.trim();
    }

    public Date getFileCreTim() {
        return fileCreTim;
    }

    public void setFileCreTim(Date fileCreTim) {
        this.fileCreTim = fileCreTim;
    }

    public Integer getFileRoom() {
        return fileRoom;
    }

    public void setFileRoom(Integer fileRoom) {
        this.fileRoom = fileRoom;
    }

    public Integer getFileOrder() {
        return fileOrder;
    }

    public void setFileOrder(Integer fileOrder) {
        this.fileOrder = fileOrder;
    }

    public Integer getFileUse() {
        return fileUse;
    }

    public void setFileUse(Integer fileUse) {
        this.fileUse = fileUse;
    }

    public Integer getFileType() {
        return fileType;
    }

    public void setFileType(Integer fileType) {
        this.fileType = fileType;
    }
}