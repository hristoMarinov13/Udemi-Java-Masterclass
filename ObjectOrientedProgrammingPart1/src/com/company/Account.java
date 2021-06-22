package com.company;

public class Account {
    private String number;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;

    public Account(){
        this("Default number", 0.0, "Default name", "default email","Default phone number");
        System.out.println("Just empty constructor");
    }

    public Account(String number, double balance, String name, String email, String phoneNumber){

        System.out.println("Account constructor with parameters is called");
        this.number = number;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Account(String name, String email, String phoneNumber) {
        this("Default number", 0.0 , name, email, phoneNumber);
    }

    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + ". Your current balance is " + this.balance);
    }

    public void withdrawal (double withdrawalAmount){
        if (this.balance  - withdrawalAmount < 0){
            System.out.println("Insufficient funds!" + this.balance + " only left!");
        }else{
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + ". Your current balance is " + balance);
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


}


