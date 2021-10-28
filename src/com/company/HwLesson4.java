package com.company;

import java.util.Random;
import java.util.Scanner;

public class HwLesson4 {

    public static final String HUMAN_WIN = "Вы победили,Человек!";
    public static final String AI_WIN = "Победил гениальный искусственный интеллект.";

    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static final char DOT_EMPTY ='•';

    public static final int SIZE = 5;
    public static final char[][] MAP = new char[SIZE][SIZE];
    public static final int DOTS_WIN = 4;

    public static final Scanner SCANNER = new Scanner(System.in);
    public static final Random RANDOM = new Random();

    public static void main(String[] args) {

        editMap();
        printMap();

        while (true) {
            humanTurn();
            printMap();

            if (checkEndGame(DOT_X,HUMAN_WIN)) {
                break;
            }

            aiTurn();
            printMap();

            if (checkEndGame(DOT_O, AI_WIN)) {
                break;
            }
        }
        System.out.println("Игра окончена");
    }

    private static boolean checkEndGame(char dot, String message) {
        if (isWin(dot)){
            System.out.println(message);
            return true;
        }

        if (isMapFull()) {
            System.out.println("Ничья");
            return true;
        }
        return false;
    }

    private static boolean isWin(char symbol){
         int countDiag=0, countDiag2=0;

        for (int row = 0; row < SIZE; row++) {
            int countRow=0, countCol=0;
            for (int col = 0; col < SIZE; col++) {
                if (MAP[row][col] == symbol) countRow++;
                if (MAP[col][row] == symbol) countCol++;
            }
            if (MAP[row][row] == symbol) countDiag++;
            if (MAP[row][SIZE - row - 1] == symbol) countDiag2++;

            if (countRow == DOTS_WIN || countCol == DOTS_WIN || countDiag == DOTS_WIN || countDiag2== DOTS_WIN) return true;
        }
        return false;
    }

    private static boolean isMapFull(){
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (MAP[i][j]==DOT_EMPTY) return false;
            }
        }
        return true;
    }

    private static void aiTurn() {
        int row,col;
        do {
            System.out.println("Ход компьютера");
            row= RANDOM.nextInt(SIZE);
            col= RANDOM.nextInt(SIZE);
        } while (!isTurnValid(row, col));
        MAP[row][col]=DOT_O;
    }

    private static void humanTurn() {

         int row,col;
        do {
            System.out.println("Ваш ход, введите Х и У");
            row= SCANNER.nextInt()-1;
            col= SCANNER.nextInt()-1;
        } while (!isTurnValid(row, col));
        MAP[row][col]=DOT_X;
    }

    private static boolean isTurnValid(int x, int y) {
        if ((x <0 || x >=SIZE) || (y < 0 || y >=SIZE)) {
            System.out.println("Координаты вне зоны");
            return false;
        }
        if (MAP[x][y] != DOT_EMPTY) {
            System.out.println("Клетка занята");
            return false;
        }
        return true;
    }

    private static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();


        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(MAP[i][j] + " ");
            }
            System.out.println();
         }
        System.out.println();
    }

    private static void editMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                MAP[i][j]=DOT_EMPTY;
            }
        }
    }

}
