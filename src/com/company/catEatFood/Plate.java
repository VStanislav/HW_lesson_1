package com.company.catEatFood;

import java.util.Scanner;

public class Plate {

    Scanner scanner = new Scanner(System.in);

    private int volume;

    public Plate(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume, String name,boolean satiety) {
            while (!(checkEat(volume, name, satiety)));
    }

    private boolean checkEat(int appetite, String name, boolean satiety) {
        System.out.println("В тарелке "+volume+" ед. еды.");
        if (volume >= appetite) {
            this.volume = volume - appetite;
            satiety=true;
            System.out.println("Сытость "+name+" : "+satiety+"\nЕды осталось " + volume + " ед.");
            return true;
        } else  {
            System.out.println("Сытость "+name+" : "+satiety);
            return putMoreFood();
        }
    }

    private boolean putMoreFood() {
        System.out.println("Если хотите добавить еды, нажмите - 1 !");

        if (scanner.nextInt() == 1){
            System.out.println("Введите объем корма :");
            this.volume += scanner.nextInt();
            return false;
        }else {
            System.out.println("Вы не добавили корма");
            return true;
        }
    }
}
