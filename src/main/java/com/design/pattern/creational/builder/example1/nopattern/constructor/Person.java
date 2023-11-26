package com.design.pattern.creational.builder.example1.nopattern.constructor;

public class Person {
    private String name; // 이름
    private int age; // 나이
    private int weight; // 몸무게
    private int height; // 키

    public Person(String name, int age, int weight, int height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}
