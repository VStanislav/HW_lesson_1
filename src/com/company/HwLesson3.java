package com.company;

import java.util.Arrays;

public class HwLesson3 {

    public static void main(String[] args) {

        // Задание №1
        System.out.println("Задание №1");

        int[] mass = {1, 1, 0, 0, 1, 1, 0, 0, 1, 1};
        System.out.println(Arrays.toString(mass) + " - Начальный");
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == 0) mass[i] = 1;
            else mass[i] = 0;
        }
        System.out.println(Arrays.toString(mass)+ " - Итоговый");

        // Задание №2
        System.out.println("\nЗадание №2");

        int[] massNull = new int[100];
        for (int i = 0; i < massNull.length; i++) massNull[i] = i + 1;
        System.out.println(Arrays.toString(massNull));

        // Задание №3
        System.out.println("\nЗадание №3");

        int[] massMultiply = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, -1};
        System.out.println(Arrays.toString(massMultiply)+ " - Начальный");
        for (int i = 0; i < massMultiply.length; i++) {
            if (massMultiply[i] < 6) massMultiply[i] *= 2;
        }
        System.out.println(Arrays.toString(massMultiply)+ " - Итоговый");

        // Задание №4
        System.out.println("\nЗадание №4");

        int[][] massSquare = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    massSquare[i][massSquare.length - 1 - j] = 1;
                    massSquare[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) System.out.print(" " + massSquare[i][j] + " ");
            System.out.println();
        }

        // если перенести вывод sout в 1й цикл
        // то кресть получается не полный. или я недосообразил как это сделать.

        // Задание №5
        System.out.println("\nЗадание №5");

        array(5, 12);

        // Задание №6
        System.out.println("\n\nЗадание №6");

        System.out.println("Максимальное число : " + getMax(massMultiply) +
                            ".\nМинимальное число : " + getMin(massMultiply));

        // Задание №7
        System.out.println("\nЗадание №7");

        System.out.println(checkBalance(massMultiply));

        // Задание №8
        System.out.println("\nЗадание №8");

        System.out.println(Arrays.toString(changePosition(massMultiply, 13)) + " - Итоговый");

    }

    public static int[] array(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
            System.out.print(" " + array[i] + " ");
        }
        return array;
    }

    public static int getMax(int[] array) {
        int maxValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (maxValue < array[i]) maxValue = array[i];
        }
        return maxValue;
    }

    public static int getMin(int[] array) {
        int minValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (minValue > array[i]) minValue = array[i];
        }
        return minValue;
    }

    public static boolean checkBalance(int[] array) {

        int sumLeft = 0;
        int sumRight = 0;
        for (int i : array) {
            sumRight += i;
        }
        for (int j : array) {
            if (sumLeft == sumRight) return true;
            sumLeft += j;
            sumRight -= j;
        }
        return false;
    }

    public static int[] changePosition (int [] array, int x) {
        int[] arrayHelper = new int[array.length];
        System.out.println(Arrays.toString(array) + " - Начальный");

        for (int i = 0; i < array.length; i++) {
            if (x>array.length || x<-array.length) x %= array.length;
                if (i-x<0 /* для Х - положительного, но смещение в право*/) arrayHelper[i] = array[i - x + array.length];
                else if (i-x>array.length-1 /* для Х - отрицательного, но смещение в лево*/) arrayHelper[i] = array[i - x - array.length];
                else arrayHelper[i] = array[i - x];
        }
        return arrayHelper;
    }
}
