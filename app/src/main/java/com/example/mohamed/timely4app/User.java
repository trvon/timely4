package com.example.mohamed.timely4app;

/**
 * Created by mohamed on 4/1/17.
 */

public class User {
    public String fName;
    public String id;
    public String lName;
    public String date;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public User(String fName, String id, String lName) {
        this.fName = fName;
        this.id = id;
        this.lName = lName;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }
}
