package com.design.pattern.creational.singleton.example1.nopattern;

public class Main {

    public static void main(String[] args) {
        NotSingleton instance1 = new NotSingleton("a", "b");
        NotSingleton instance2 = new NotSingleton("a", "b");

        System.out.println("instance1 = " + instance1);
        System.out.println("instance2 = " + instance2);
        System.out.println("(instance1 == instance2) = " + (instance1 == instance2));
    }

}
