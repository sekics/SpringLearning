package com.portrait.pojo;

import java.util.Date;

public class Res {

    private String name ;
    private String type ;
    private int rank ;
    private int score ;
    private int weight ;
    private Date time ;
    private int eid ;

    public Res() {
    }

    public Res(String name, String type, int rank, int score, int weight, Date time, int eid) {
        this.name = name;
        this.type = type;
        this.rank = rank;
        this.score = score;
        this.weight = weight;
        this.time = time;
        this.eid = eid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    @Override
    public String toString() {
        return "Res{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", rank=" + rank +
                ", score=" + score +
                ", weight=" + weight +
                ", time=" + time +
                ", eid=" + eid +
                '}';
    }
}
