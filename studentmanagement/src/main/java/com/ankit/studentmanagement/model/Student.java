package com.ankit.studentmanagement.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection  = "student")
public class Student {
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Id
    private String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    private String address;
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address=address;
    }

    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    private String course;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    private String city;
    public Student(){

    }
        public Student(String id, String name, int age, String course, String city, String address){
            this.id=id;
            this.name=name;
            this.age=age;
            this.course=course;
            this.city=city;
            this.address=address;

    }
}
