package com.company;

public class HW_less_2 {

    public static void main(String[] args) {

        gapNum(5,61);
        numType(-6);
        numType_2(0);
        print("Слово которое печатать ", 4);
        checkLeapYear(2130);

    }

    public static void gapNum(int a, int b){
        int sum = a+b;
        // можно конечно и без объявление переменной sum, но сделал так :)

        // if(sum >= 10 && sum <= 20) System.out.println("true");
        // else System.out.println("false");

        System.out.println(sum >= 10 && sum <= 20);
    }

    public static void numType(int b){

        if(b >= 0) System.out.println("Число положительно");
        else System.out.println("Число отричательно");
    }

    public static void numType_2(int num){

        System.out.println(num < 0);
        //В этом задании не указано чем является 0(как в задаче 2)
        // при необходимости вывода что число является нулем, можно сделать конструкцию if else
    }

    public static void print (String word , int count){
        for (int i = 0; i<count; i++){
            System.out.println(word);
        }
    }

    public static void checkLeapYear(int year) {

        if (year % 4 != 0) {
            if (year%100 !=0){
                if (year%400 != 0){
                    System.out.println("Год " + year + " не является високосным");
                }
            }
        } else System.out.println("Год " + year + " является високосным");


    }

}
