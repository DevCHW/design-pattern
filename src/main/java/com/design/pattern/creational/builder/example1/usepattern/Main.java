package com.design.pattern.creational.builder.example1.usepattern;

public class Main {

    public static void main(String[] args) {
        Person person = Person.builder()
                .name("Freddie")
                .age(27)
                .height(171)
                .weight(65)
                .build();

        System.out.println("person = " + person);
        // person = Person{name='Freddie', age=27, weight=65, height=171}
    }

}
