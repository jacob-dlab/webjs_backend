package com.example.javscript_class.model;

public class AgeResponse {
    private String name;
    private String school;
    private int futureAge;

    public AgeResponse() {}

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSchool() {
        return school;
    }
    public void setSchool(String school) {
        this.school = school;
    }
    public int getFutureAge() {
        return futureAge;
    }
    public void setFutureAge(int futureAge) {
        this.futureAge = futureAge;
    }
}