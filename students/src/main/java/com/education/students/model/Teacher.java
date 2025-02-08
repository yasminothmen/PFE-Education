package com.education.students.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Teacher {
    @JsonProperty("firstName")
    private String name;
    private Integer age;
    //getter et setter mte3 name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    //constructeur mte3 name rempli :
    public Teacher (String name){
        this.name = name;
    }

    //getter et setter mte3 age
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    //constructeur vide :
    public Teacher(){}

    //constructeur rempli :
    public Teacher(String name,Integer age){
        this.name = name;
        this.age = age;
    }

}
