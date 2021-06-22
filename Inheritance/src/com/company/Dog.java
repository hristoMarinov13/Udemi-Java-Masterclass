package com.company;

public class Dog extends Animal{

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name,  int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }



    public  void bark(){
        System.out.println("Dog.bark() is called");
        makeNoise();
    }

    public void whine(){
        System.out.println("Dog.whine() is called");
        super.makeNoise();
    }

    @Override
    public void makeNoise() {
        System.out.println("Dog.makeNoise() is called");
    }

    private void chew(){
        System.out.println("Dog.chew() is called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat is called");
        chew();
        super.eat();
    }

    public void walk(){
        System.out.println("Dog.walk() is called");
        super.move(5);
    }

    public void run(){
        System.out.println("Dog.run() is called");
        move(10);
    }

    public void moveLegs(){
        System.out.println("Dog.moveLegs() is called");
    }

//    @Override
//    public void move(int speed) {
//        System.out.println("Dog.move(int speed) is called");
//        moveLegs();
//        super.move(speed);
//    }
}
