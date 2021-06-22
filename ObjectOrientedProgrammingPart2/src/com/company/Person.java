package com.company;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void dance(){
        System.out.println(name + " now dances");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
