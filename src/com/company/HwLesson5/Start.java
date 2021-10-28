package com.company.HwLesson5;

import java.util.Random;

public class Start {

    public static void main(String[] args) {
        int minAge=18, maxAge=75;

        Employee[] allNewEmployees = {
                new Employee("Прохоров Мстислав Олегович", "Java Junior", getRandomAge(minAge,maxAge)),
                new Employee("Иванов Сергей Игоревич", "Java Senior", getRandomAge(minAge,maxAge)),
                new Employee("Кутявин Иван Анатольевич", "Java Junior", getRandomAge(minAge,maxAge)),
                new Employee("Стам Олег Борисович", "Java Junior", getRandomAge(minAge,maxAge)),
                new Employee("Нигде Семен Маркович", "Java Middle", getRandomAge(minAge,maxAge))
        };

        for (int i = 0; i < allNewEmployees.length; i++) {
            if (allNewEmployees[i].getAge()>40) allNewEmployees[i].fullInfoEmployee();
        }
    }
    public static int getRandomAge(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }
}