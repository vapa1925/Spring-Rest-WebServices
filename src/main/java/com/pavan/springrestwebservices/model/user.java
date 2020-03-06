package com.pavan.springrestwebservices.model;

import javax.persistence.*;

@Entity
@Table(name="USER")
public class user {
    @Id
    @GeneratedValue
    private int userid;
    private String name;

    @Override
    public String toString() {
        return "user{" +
                "userid=" + userid +
                ", name='" + name + '\'' +
                '}';
    }

    public user() {
    }

    public user(int userid, String name) {
        this.userid = userid;
        this.name = name;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
