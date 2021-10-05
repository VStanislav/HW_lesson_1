package com.company;

public class HomeWorkApp {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();


    }
    public static void printThreeWords(){
        System.out.println("Orange\nBanana\nApple");
    }

    public static void checkSumSign() {
        int a=5, b=10;

        if (a+b >= 0) System.out.println("Сумма положительная");
        else System.out.println("Сумма отрицательная");
    }

    public static void printColor() {
        int value = 30;

        if (value <= 0) System.out.println("Красный");
        else if (value > 0 && value <= 100)System.out.println("Желтый");
        else System.out.println("Зеленый");

        // В задании указано если более 100 то зеленый. Я не стал делать 3й if else,
        // т.к. нет смысла.

    }

    public static void compareNumbers() {
        int a=-20, b=77;

        if (a>=b) System.out.println("a>=b");
        else System.out.println("a<b");
    }
}
