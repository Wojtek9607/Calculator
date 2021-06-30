package com.kodilla;

class Kalkulator {

    int dodawanie(int a, int b) {
        return (a + b);

    }

    int odejmowanie(int a, int b) {
        return (a - b);
    }
}
class Aplicattion {
    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();
        System.out.println("Wynik dodawania : " + kalkulator.dodawanie(5,7));
        System.out.println("Wynik odejmowania : " + kalkulator.odejmowanie(10, 9));

    }
}




















