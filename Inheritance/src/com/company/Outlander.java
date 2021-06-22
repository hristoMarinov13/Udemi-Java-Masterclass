package com.company;

public class Outlander extends Car{
    private int roadService;

    public Outlander(int roadService) {
        super("Outlander", "4WD", 5, 5, 6, false);
        this.roadService = roadService;
    }

    public void accelerate(int rate){
        int newVelocity = getCurrentVelocity() + rate;

        if (newVelocity > 0 && newVelocity == 0){
            super.stop();
            super.changeGear(1);
        }else if(newVelocity > 0 && newVelocity > 10){
            super.changeGear(1);
        } else if (newVelocity > 10 && newVelocity > 20){
            super.changeGear(2);
        }else if (newVelocity > 20 && newVelocity >30){
            super.changeGear(3);
        }else if (newVelocity > 30 && newVelocity > 40){
            super.changeGear(4);
        }

        if (newVelocity > 0){
            changeVelocity(newVelocity, getCurrentDirection());
        }

    }
}
