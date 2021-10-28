package com.company.catEatFood;

import java.util.Scanner;

public class Plate {

    Scanner scanner = new Scanner(System.in);

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    private int volume;

    public Plate(int volume) {
        this.volume = volume;
    }

    public boolean putMoreFood() {
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
