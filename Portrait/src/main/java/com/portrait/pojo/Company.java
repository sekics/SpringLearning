package com.portrait.pojo;

import java.util.Date;

public class Company {
    private String name ;
    private int score ;
    private Date time ;

    public Company() {
    }

    public Company(String name, int score, Date time) {
        this.name = name;
        this.score = score;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", time=" + time +
                '}';
    }
}
