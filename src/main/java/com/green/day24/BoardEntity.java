package com.green.day24;

public class BoardEntity {
    private int iboard;
    private String title;
    private String ctnts;
    private String writer;
    private String createdAt;
    private String updatedAt;

    @Override
    public String toString() {
        return String.format("iboard : %d, title : %s, ctnts : %s, writer : %s, createdAt : %s, updatedAt: %s"
                            ,iboard,title,ctnts,writer,createdAt,updatedAt);
    }

    public int getIboard() {
        return iboard;
    }

    public void setIboard(int iboard) {
        this.iboard = iboard;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCtnts() {
        return ctnts;
    }

    public void setCtnts(String ctnts) {
        this.ctnts = ctnts;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }
}
