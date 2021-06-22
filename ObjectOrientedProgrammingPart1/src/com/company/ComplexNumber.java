package com.company;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void add(ComplexNumber cn){
        add(cn.real, cn.imaginary);
    }

    public void add(double r, double i){
        this.real += r;
        this.imaginary +=i;
    }

    public void subtract(ComplexNumber cn){
        subtract(cn.real, cn.imaginary);
    }

    public void subtract(double r, double i){
        this.real -= r;
        this.imaginary -=i;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }
}
