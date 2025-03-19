package com.example.demo;

public class Person {
    private String name;
    private int age;
    private String address;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Bob");
        person.setAge(23);
        person.setAddress("141 Liberty Str");
        System.out.println("Name: " + person.getName() + ", Age: " + person.getAge() + ", Address: " + person.getAddress());
    }
}