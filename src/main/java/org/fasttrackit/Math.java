package org.fasttrackit;

public class Math {

    public int sum (int first, int second) {
        int sum = first + second;
        System.out.println(first + " + " + second + " = " + sum + "\nInt numbers") ;
        return sum;
    }
    public double sum ( double first, double second) {
        double sum = first + second;
        System.out.println(first + " + " + second + " = " + sum + "\nDouble numbers") ;
        return sum;
    }

    public int multiply (int first, int second) {
        int multiply = first * second;
        System.out.println(first + " * " + second + " = " + multiply + "\nInt numbers");
        return multiply;

    }
    public double multiply ( double first, double second) {
        double multiply = first * second;
        System.out.println(first + " * " + second + " = " + multiply + "\nDouble numbers");
        return multiply;
    }

}
