package com.kodilla;

class Calculator {

    int addition(int a, int b) {
        return (a + b);

    }

    int subtraction(int a, int b) {
        return (a - b);
    }
}
class Aplicattion {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Wynik dodawania : " + calculator.addition(5,7));
        System.out.println("Wynik odejmowania : " + calculator.subtraction(10, 9));

    }
}




















