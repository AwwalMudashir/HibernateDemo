package com.api.HibernateDemo.model;

import jakarta.persistence.*;

@Entity // to tell the app that this is a model.. so it creates a table in our database
// @Table(name = "student_spring_table") // if you dont want he default name of the table to be the name of the class you can change it by using this
public class Student {

//    Hibernate automatically creates a table with all these properties present.
    @Id // a needed id for the table
    @GeneratedValue(strategy = GenerationType.IDENTITY) // this means that the id field is the primary key and it's being auto-incremented
    private int id;

    //@Column(name = "student_name") // if you dont want the default column name to be the property name , you can change it like this
    private String name;
    private int age;
    private String tech;

    public Student() {
    }

    public Student(String name, int age, String tech) {
        this.name = name;
        this.age = age;
        this.tech = tech;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name='" + name + '\'' + ", age=" + age + ", tech='" + tech + '\'' + '}';
    }


}
