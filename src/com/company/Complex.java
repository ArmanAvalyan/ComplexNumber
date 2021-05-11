package com.company;

public class Complex {
    private double realPart, imaginaryPart;

    public Complex() {
    }

    public Complex(double realPart, double imaginaryPart) {
        setRealPart(realPart);
        setImaginaryPart(imaginaryPart);
    }

    public Complex add(Complex realPart, Complex imaginaryPart) {
        Complex temp = new Complex();
        temp.realPart = realPart.getRealPart() + imaginaryPart.getRealPart();
        temp.imaginaryPart = realPart.getImaginaryPart() + imaginaryPart.getImaginaryPart();
        return temp;
    }

    public Complex subtract(Complex realPart, Complex imaginaryPart) {
        Complex temp = new Complex();
        temp.realPart = realPart.getRealPart() - imaginaryPart.getRealPart();
        temp.imaginaryPart = realPart.getImaginaryPart() - imaginaryPart.getImaginaryPart();
        return temp;
    }

    public String toString() {
        return "Complex number: " + getRealPart() + " + " + getImaginaryPart() + "i";
    }

    public double getRealPart() {
        return realPart;
    }

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }
}

