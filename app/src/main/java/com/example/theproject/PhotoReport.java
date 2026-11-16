package com.example.theproject;

public class PhotoReport {
    private String photoId;
    private String photoPath;
    private String caption;
    private long timestamp;

    public PhotoReport() {
    }

    public PhotoReport(String photoId, String photoPath, String caption, long timestamp) {
        this.photoId = photoId;
        this.photoPath = photoPath;
        this.caption = caption;
        this.timestamp = timestamp;
    }

    public String getPhotoId() {
        return photoId;
    }

    public void setPhotoId(String photoId) {
        this.photoId = photoId;
    }

    public String getPhotoPath() {
        return photoPath;
    }

    public void setPhotoPath(String photoPath) {
        this.photoPath = photoPath;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}