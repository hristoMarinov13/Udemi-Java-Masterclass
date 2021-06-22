package com.company;

public class Addition {
    private String type;
    private double extraPrice;

    public Addition(){
        this.type = "empty";
        this.extraPrice = 0;
    }

    public double getExtraPrice() {
        return extraPrice;
    }

    public void haveLettuce(){
        this.type = "Lettuce";
        this.extraPrice = 0.29 ;
    }

    public void haveTomato(){
        this.type = "Tomato";
        this.extraPrice = 0.29;
    }

    public void haveCarrot(){
        this.type = "Carrot";
        this.extraPrice = 0.29;
    }



}
