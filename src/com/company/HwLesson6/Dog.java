package com.company.HwLesson6;

public class Dog extends Animal {

    public static int count = 0;

    public Dog() {
        count++;
    }

    protected void swim(int distance) {
        if (distance>0 && distance<= 50){
            System.out.println("Пес №" + count + " смог проплыть " + distance + " метров.\n");
        }else System.out.println("Пес №" +count+ " столько не проплывет - " +distance+ "м. Запас сил на 50м.\n");
    }

    protected void run(int distance) {
        if (distance>0 && distance<=500){
            System.out.println("Пес №" + count + " смог пробежать " + distance + " метров.\n");
        }else System.out.println("Пес №" +count+" столько не пробежит - " +distance+ "м. Запас сил на 500м.\n");
    }
}
