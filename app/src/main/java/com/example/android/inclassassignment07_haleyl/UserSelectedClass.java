package com.example.android.inclassassignment07_haleyl;


import java.io.Serializable;

public class UserSelectedClass implements Serializable {

    String name;
    String birthday;
    boolean isMember;
    String pace;

    public UserSelectedClass(String name, String birthday, boolean isMember, String pace) {

        this.name = name;
        this.birthday = birthday;
        this.isMember = isMember;
        this.pace = pace;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public boolean getIsMember() {
        return isMember;
    }

    public void setIsMember(boolean isMember) {
        this.isMember = isMember;
    }

    public String getPace() {
        return pace;
    }

    public void setPace(String pace) {
        this.pace = pace;
    }

    public String toString() {

        return "Name: " + name + "\nBirthday: " + birthday + "\nRun Club Member?: " +
                isMember + "\nEstimated Mile Pace: " + pace;
    }

}
