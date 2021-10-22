package com.company.HwLesson6;

import java.util.Random;

public class Start {

    Random random = new Random();

    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 5; i++) {

            Cat cat = new Cat();
            cat.run(random.nextInt(300));
            cat.swim(random.nextInt(21));

            Dog dog = new Dog();
            dog.run(random.nextInt(600));
            dog.swim(random.nextInt(100));

        }

        System.out.printf("Всего в эксперименте участвовало %d собак и %d кошек и всего животных %d.",
                Dog.count, Cat.count, Animal.count);
    }
}
