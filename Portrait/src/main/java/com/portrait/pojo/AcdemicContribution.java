package com.portrait.pojo;

import java.util.Date;

public class AcdemicContribution {

    private String authorId ;
    private String authorName ;
    private Date time ;
    private String type ;
    private String name ;
    private String pubType ;
    private int totalPerson ;
    private int identityRank ;

    public AcdemicContribution() {
    }

    public AcdemicContribution(String id, String authorName, Date time, String type, String name, String pubType, int totalPerson, int identityRank) {
        this.authorId = id;
        this.authorName = authorName;
        this.time = time;
        this.type = type;
        this.name = name;
        this.pubType = pubType;
        this.totalPerson = totalPerson;
        this.identityRank = identityRank;
    }

    public String getId() {
        return authorId;
    }

    public void setId(String id) {
        this.authorId = id;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPubType() {
        return pubType;
    }

    public void setPubType(String pubType) {
        this.pubType = pubType;
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

    @Override
    public String toString() {
        return "AcdemicContribution{" +
                "authorId='" + authorId + '\'' +
                ", authorName='" + authorName + '\'' +
                ", time=" + time +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", pubType='" + pubType + '\'' +
                ", totalPerson=" + totalPerson +
                ", identityRank=" + identityRank +
                '}';
    }
}
