package com.design.pattern.creational.builder.example1.nopattern.constructor;

/**
 * 1. 생성자를 이용하여 객체 생성하기
 */
public class Main {

    public static void main(String[] args) {
        Person person = new Person("Freddie", 27, 171, 65);
        System.out.println("person = " + person);
        // person = Person{name='Freddie', age=27, weight=171, height=65}
    }

}
