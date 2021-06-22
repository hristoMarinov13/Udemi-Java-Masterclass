package com.company;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer() {
        this("Default name", 0.0, "Default email");
        System.out.println("Constructor with no parameters");
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "default email");
        System.out.println("Constructor with two parameters");
    }

    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
        System.out.println("Constructor with three parameters");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
