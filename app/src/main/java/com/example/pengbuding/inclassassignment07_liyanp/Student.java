package com.example.pengbuding.inclassassignment07_liyanp;

import java.io.Serializable;

/**
 * Created by pengbuding on 07/03/2018.
 */

public class Student implements Serializable {
    private String name;
    private int age;
    private boolean pass;

    public Student(){}

    public Student(String name, int age, boolean pass){
        this.name = name;
        this.age = age;
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isPass() {
        return pass;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPass(boolean pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "Name: " + name +
                "\nAge: " + age +
                "\nPass? " + pass + "\n\n";
    }
}
