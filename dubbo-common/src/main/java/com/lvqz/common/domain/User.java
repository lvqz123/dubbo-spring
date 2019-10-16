package com.lvqz.common.domain;

import java.io.Serializable;

/**
 * @author: lvqz
 * @date: 2019/10/14
 * @time: 15:55
 */
public class User implements Serializable {

    private static final long serialVersionUID = -3008494441853731861L;
    private int id;
    private String name;

    public User(){

    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
