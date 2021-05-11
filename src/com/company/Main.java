package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Complex complex1 = new Complex(2.5, 3.6);
        Complex complex2 = new Complex(9.7, 5.5);
        System.out.println(complex1.toString());
        System.out.println(complex2.toString());

        Complex complex3 = new Complex();
        complex3 = complex3.add(complex1, complex2);
        System.out.println("Sum of " + complex3.toString().toLowerCase());
        Complex complex4 = new Complex();
        complex4 = complex4.subtract(complex1, complex2);
        System.out.println("Difference of " + complex4.toString().toLowerCase());
    }
}

