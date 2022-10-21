package com.example.homework3_4;

import java.io.Serializable;

public class Continent implements Serializable {
    private String name;
    private String flag;
    private Integer positionNum;

    public Integer getPositionNum() {
        return positionNum;
    }

    public void setPositionNum(Integer positionNum) {
        this.positionNum = positionNum;
    }

    public Continent(String name, String flag, Integer positionNum) {
        this.name = name;
        this.flag = flag;
        this.positionNum=positionNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
}
