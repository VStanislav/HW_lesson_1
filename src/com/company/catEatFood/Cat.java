package com.company.catEatFood;

public class Cat {

    public String getName() {
        return name;
    }

    public boolean isSatiety() {
        return satiety;
    }

    private final String name;
    private final int appetite;

    private  boolean satiety;

    public Cat(int appetite,String name) {
        this.appetite = appetite;
        this.name=name;
    }

    public void catEatFood(Plate plate) {

        if (appetite==0) {
            satiety=true;
            System.out.println("\nСытость "+name+" : "+satiety);
        } else {
            System.out.println("Кошка " + name + " голодна на - " + appetite + " ед.");
            while (!(checkEat(plate)));
        }
    }
    private boolean checkEat(Plate plate) {
        System.out.println("В тарелке "+plate.getVolume()+" ед. еды.");
        if (plate.getVolume() >= appetite) {

            plate.setVolume(plate.getVolume() - appetite);
            satiety=true;
            System.out.println("Сытость "+name+" : "+satiety+"\nЕды осталось " + plate.getVolume() + " ед.");
            return satiety;

        } else  {
            System.out.println("Сытость "+name+" : "+satiety);
            return plate.putMoreFood();
        }
    }
}
