package edu.tseidler;

public class Main {
    public static void main(String[] args) {
        Complex number = new Complex(5, 3);
        System.out.println(number);
        System.out.println(ToStringGenerator.toString(number));
    }
}
