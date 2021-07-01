package com.portrait.pojo;

import java.util.Date;

public class Standard {
    private String authorId ;
    private String authorName ;
    private Date time ;
    private String name ;
    private String level ;
    private int totalPerson ;
    private int identityRank ;

    public Standard() {
    }

    public Standard(String authorId, String authorName, Date time, String name, String level, int totalPerson, int identityRank) {
        this.authorId = authorId;
        this.authorName = authorName;
        this.time = time;
        this.name = name;
        this.level = level;
        this.totalPerson = totalPerson;
        this.identityRank = identityRank;
    }

    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalPerson() {
        return totalPerson;
    }

    public void setTotalPerson(int totalPerson) {
        this.totalPerson = totalPerson;
    }

    public int getIdentityRank() {
        return identityRank;
    }

    public void setIdentityRank(int identityRank) {
        this.identityRank = identityRank;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Standard{" +
                "authorId='" + authorId + '\'' +
                ", authorName='" + authorName + '\'' +
                ", time=" + time +
                ", name='" + name + '\'' +
                ", level='" + level + '\'' +
                ", totalPerson=" + totalPerson +
                ", identityRank=" + identityRank +
                '}';
    }
}
