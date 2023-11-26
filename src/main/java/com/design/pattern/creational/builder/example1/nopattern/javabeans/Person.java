package com.design.pattern.creational.builder.example1.nopattern.javabeans;

public class Person {
    private String name; // 이름
    private int age; // 나이
    private int weight; // 몸무게
    private int height; // 키

    public Person() {}

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setHeight(int height) {
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
