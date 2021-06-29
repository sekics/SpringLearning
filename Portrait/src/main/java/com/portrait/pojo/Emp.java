package com.portrait.pojo;

import java.util.Date;
import java.util.List;

public class Emp {
    private int id ;
    private String name ;
    private int score ;
    private Date time ;
    private Company company ;
    private List<Res> resList ;

    public Emp() {
    }

    public Emp(int id, String name, int score, Date time, Company company, List<Res> resList) {
        this.id = id;
        this.name = name;
        this.score = score;
        this.time = time;
        this.company = company;
        this.resList = resList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public List<Res> getResList() {
        return resList;
    }

    public void setResList(List<Res> resList) {
        this.resList = resList;
    }


    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", score=" + score +
                ", time=" + time +
                ", company=" + company +
                ", resList=" + resList +
                '}';
    }
}
