package lesson1;

import javax.swing.*;

///printTheeWords
public class HomeWork1 {
    public static void main(String[] args) {
        printOrange();
        printBanana();
        printApple();
        checkSumSign();
        printColor();
        compareNumbers();

    }

    //    printOrange
    public static void printOrange() {
        System.out.println("Orange");

    }

    //    printBanana
    public static void printBanana() {
        System.out.println("Banana");
    }

    //    printApple
    public static void printApple() {
        System.out.println("Apple");
    }

    //    checkSumSign()
    private static void checkSumSign() {

        int a = 4;
        int b = 10;
        int resutl = a + b;
        System.out.println(resutl);
        if (resutl >= 0) {
            System.out.println("Сумма положительная");
        } else if (resutl <= 0) {
            System.out.println("Сумма отрицательная");
        }
    }

    //    printColor()
    private static void printColor() {
        int value = 65;
        System.out.println(value);
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value >= 0 && value <= 100) {
            System.out.println("Желтый");
        } else if (value > 100) {
            System.out.println("Зеленый");
        }
    }

//    compareNumbers()
    private static void compareNumbers() {
        int a = 22;
        int b = 0;
        if (a > b) {
            System.out.println("a>=b");
        }
        else if (a < b) {
            System.out.println("a<b");
        }
    }
}