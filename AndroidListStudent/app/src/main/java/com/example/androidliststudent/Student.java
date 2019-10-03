package com.example.androidliststudent;

public class Student {

    public String name;

    public float age;

    public String hometown;

    public String typephone;


    public Student(String name, float age, String hometown) {
        this.name = name;
        this.age = age;
        this.hometown = hometown;
    }

    public Student(String name, float age, String hometown, String typephone ) {
        this.name = name;
        this.age = age;
        this.hometown = hometown;
        this.typephone = typephone;
    }
}
