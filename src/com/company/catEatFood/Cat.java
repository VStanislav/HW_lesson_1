package com.company.catEatFood;

public class Cat {

    private final String name;
    private final int appetite;
    private final boolean satiety;
    // IDE предложило методы финальные. Разобраться почему.

    // При необходимости добавить get\set на все переменные. Пока не придумал где их использовать

    public Cat(int appetite,String name, boolean satiety) {
        this.appetite = appetite;
        this.name=name;
        this.satiety = satiety;
    }

    public void catEatFood(Plate plate) {

        checkHungryCat(plate);

    }

    private void checkHungryCat(Plate plate) {
        if (appetite==0) {
            System.out.println("\nСытость "+name+" : "+satiety);
        } else {
            System.out.println("Кошка " + name + " голодна на - " + appetite + " ед.");
            plate.setVolume(appetite, name,satiety);
        }
    }

}
