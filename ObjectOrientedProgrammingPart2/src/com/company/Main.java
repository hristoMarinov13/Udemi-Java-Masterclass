package com.company;

import java.sql.SQLOutput;


public class Main {

    public static void main(String[] args) {
         Hamburger hamburger = new Hamburger("Basic", "Sausage", "White" , 3.56);
         double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.13);
        price = hamburger.itemizeHamburger();
        System.out.println("Total price of the burger is: " + price);
        System.out.println("\n");

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHealthExtra1("Egg", 5.43);
        healthyBurger.addHamburgerAddition2("Lentice", 3.41);
        System.out.println(healthyBurger.itemizeHamburger());
        System.out.println("\n");

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.addHamburgerAddition3("asda", 2);
        System.out.println(deluxeBurger.itemizeHamburger());




    }
}
