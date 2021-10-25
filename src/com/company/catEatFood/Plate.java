package com.company.catEatFood;

public class Plate {

    private int volume;

    public Plate(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void infoFood (){
        System.out.println("Кол-во еды в тарекле: " + (volume));
    }
}
