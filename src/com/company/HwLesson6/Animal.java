package com.company.HwLesson6;

public class Animal {

    public static int count=0;

    protected Animal (){
        count++;
    }

    protected void swim () {
        System.out.println("Животное может плавать");
    }

    protected void run () {
        System.out.println("Животное может бегать");
    }
}
