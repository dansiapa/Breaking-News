package com.project.newsapp.model;

import com.google.gson.annotations.SerializedName;

public class UserModel {
    private int personId;
    private String personName;
    private String personEmail;
    private String personPassword;
    @SerializedName("personDob")
    private String personDob;

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonEmail() {
        return personEmail;
    }

    public void setPersonEmail(String personEmail) {
        this.personEmail = personEmail;
    }

    public String getPersonPassword() {
        return personPassword;
    }

    public void setPersonPassword(String personPassword) {
        this.personPassword = personPassword;
    }

    public String getPersonDob() {
        return personDob;
    }

    public void setPersonDob(String personDob) {
        this.personDob = personDob;
    }
}
