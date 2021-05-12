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
        Complex newComplex = new Complex();
        newComplex.realPart = realPart.getRealPart() + imaginaryPart.getRealPart();
        newComplex.imaginaryPart = realPart.getImaginaryPart() + imaginaryPart.getImaginaryPart();
        return newComplex;
    }

    public Complex subtract(Complex realPart, Complex imaginaryPart) {
        Complex newComplex = new Complex();
        newComplex.realPart = realPart.getRealPart() - imaginaryPart.getRealPart();
        newComplex.imaginaryPart = realPart.getImaginaryPart() - imaginaryPart.getImaginaryPart();
        return newComplex;
    }

    @Override
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

