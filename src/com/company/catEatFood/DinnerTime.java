package com.company.catEatFood;

import java.util.Random;

public class DinnerTime {



    static Random random = new Random();
    static Plate plate = new Plate(random.nextInt(100));

    public static void main(String[] args) {

        Cat[] cats = {
                new Cat(random.nextInt(100), "Барсик"),
                new Cat(random.nextInt(100), "Мурзик"),
                new Cat(random.nextInt(100), "Пират"),
                new Cat(random.nextInt(100), "Жан Клод"),
                new Cat(random.nextInt(100), "Клео")
        };

        for (Cat cat : cats) {
            cat.catEatFood(plate);
            System.out.println("----------------Finish eating----------------\n");
        }

        for (Cat cat:cats) {
            System.out.println(cat.getName() + " голод "+cat.isSatiety());
        }

    }
}
