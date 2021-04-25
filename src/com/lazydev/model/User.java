package com.lazydev.model;

public class User {

    private String name;
    private Integer age;
    private String company;

    public User(String name, Integer age, String company) {
        this.name = name;
        this.age = age;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getCompany() {
        return company;
    }
}
