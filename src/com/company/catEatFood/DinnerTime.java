package com.company.catEatFood;

import java.util.Random;

public class DinnerTime {

    public static void main(String[] args) {
        Random random = new Random();

        Cat cat = new Cat(random.nextInt(100));
        Plate plate = new Plate(100);
        Plate plate1 = new Plate(10);

        plate.infoFood();
        cat.catEatFood(plate);
        plate.infoFood();

    }
}
