package com.alavu.fileupload_and_download_api.model;

public class FileUploadResponse {
    private String fileName;
    private String downloadUri;
    private long size;
    public String getFileName() {
        return fileName;
    }
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    public String getDownloadUri() {
        return downloadUri;
    }
    public void setDownloadUri(String downloadUri) {
        this.downloadUri = downloadUri;
    }
    public long getSize() {
        return size;
    }
    public void setSize(long size) {
        this.size = size;
    }

    
    
}
