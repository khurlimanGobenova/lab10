package com.example.demo;
public class Container<T> {
    private T value;

    public Container(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Mark");
        person.setAge(43);
        Container<Person> personContainer = new Container<>(person);
        System.out.println("Person in container: " + personContainer.getValue().getName());

        Student student = new Student();
        student.setName("Lisa");
        student.setStudentId("S67890");

        Container<Student> studentContainer = new Container<>(student);
        System.out.println("Student in container: " + studentContainer.getValue().getName() + ", ID: " + studentContainer.getValue().getStudentId());

        Container<String> stringContainer = new Container<>("Hello, Spring Boot!");
        System.out.println("String in container: " + stringContainer.getValue());
    }
}