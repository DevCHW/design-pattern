package com.design.pattern.creational.singleton.example1.usepattern;

public class Main {

    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println("instance1 = " + instance1);
        System.out.println("instance2 = " + instance2);

        System.out.println("(instance1 == instance2) = " + (instance1 == instance2));
    }
}
