package com.design.pattern.creational.builder.example1.usepattern;

public class Person {

    private String name; // 이름
    private int age; // 나이
    private int weight; // 몸무게
    private int height; // 키

    private Person(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.weight = builder.weight;
        this.height = builder.height;
    }

    static Builder builder() {
        return new Builder();
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

    static class Builder {
        private String name; // 이름
        private int age; // 나이
        private int weight; // 몸무게
        private int height; // 키

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder weight(int weight) {
            this.weight = weight;
            return this;
        }

        public Builder height(int height) {
            this.height = height;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}
