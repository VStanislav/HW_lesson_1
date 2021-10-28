package com.company.catEatFood;

import java.util.Random;

public class DinnerTime {



    static Random random = new Random();
    static Plate plate = new Plate(random.nextInt(100));

    public static void main(String[] args) {

        Cat[] cats = {
                new Cat(/*random.nextInt(100)*/ 0, "Барсик",false),
                new Cat(random.nextInt(100), "Мурзик",false),
                new Cat(random.nextInt(100), "Пират",false),
                new Cat(random.nextInt(100), "Жан Клод",false),
                new Cat(random.nextInt(100), "Клео",false)
        };

        for (Cat cat : cats) {

            cat.catEatFood(plate);
            System.out.println("----------------Finish eating----------------\n");
        }
    }
}
