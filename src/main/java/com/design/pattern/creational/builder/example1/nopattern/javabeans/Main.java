package com.design.pattern.creational.builder.example1.nopattern.javabeans;

/**
 * 2. 자바 빈(Java Beans) 패턴 사용하기
 */
public class Main {

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Freddie");
        person.setAge(27);
        person.setHeight(171);
        person.setWeight(65);

        System.out.println("person = " + person);
        // person = Person{name='Freddie', age=27, weight=171, height=65}
    }

}
