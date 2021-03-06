package com.portrait.pojo;

import java.util.Date;

public class Res {

    private String authorId ;
    private String authorName ;
    private Date time ;
    private String name ;
    private String awardLevel ;
    private String awardRank ;
    private int totalPerson ;
    private int identityRANK ;
    private int weight ;

    public Res() {
    }

    public Res(String authorId, String authorName, Date time, String name, String awardLevel, String awardRank, int totalPerson, int identityRANK, int weight) {
        this.authorId = authorId;
        this.authorName = authorName;
        this.time = time;
        this.name = name;
        this.awardLevel = awardLevel;
        this.awardRank = awardRank;
        this.totalPerson = totalPerson;
        this.identityRANK = identityRANK;
        this.weight = weight;
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

    public String getAwardLevel() {
        return awardLevel;
    }

    public void setAwardLevel(String awardLevel) {
        this.awardLevel = awardLevel;
    }

    public String getAwardRank() {
        return awardRank;
    }

    public void setAwardRank(String awardRank) {
        this.awardRank = awardRank;
    }

    public int getTotalPerson() {
        return totalPerson;
    }

    public void setTotalPerson(int totalPerson) {
        this.totalPerson = totalPerson;
    }

    public int getIdentityRANK() {
        return identityRANK;
    }

    public void setIdentityRANK(int identityRANK) {
        this.identityRANK = identityRANK;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Res{" +
                "authorId='" + authorId + '\'' +
                ", authorName='" + authorName + '\'' +
                ", time=" + time +
                ", name='" + name + '\'' +
                ", awardLevel='" + awardLevel + '\'' +
                ", awardRank='" + awardRank + '\'' +
                ", totalPerson=" + totalPerson +
                ", identityRANK=" + identityRANK +
                ", weight=" + weight +
                '}';
    }
}
