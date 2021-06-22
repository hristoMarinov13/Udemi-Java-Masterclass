package com.company;

public class WINDOW {
    private String typeOfGlass;
    private int height;
    private int length;

    public WINDOW(String typeOfGlass, int height, int length) {
        this.typeOfGlass = typeOfGlass;
        this.height = height;
        this.length = length;
    }

    public void openWindow(){
        System.out.println("Window is now opened");
    }

    public String getTypeOfGlass() {
        return typeOfGlass;
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }
}
