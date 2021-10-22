package com.company.HwLesson6;

public class Cat extends Animal {

    public static int count = 0;

    public Cat() {
        count++;
    }

    protected void swim(int distance) {
       System.out.println("Кот№" + count + " не умеет плавать. Как и все кошки. \n");
    }

    protected void run(int distance) {
        if (distance>0 && distance<=200){
            System.out.println("Кот №" + count + " смогл пробежать " + distance + " метров.\n");
        }else System.out.println("Кот №"+count+" столько не пробежит - " +distance+ "м. запас сил на 200м.\n");
    }
}
