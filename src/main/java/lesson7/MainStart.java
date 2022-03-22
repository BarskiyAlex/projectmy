package lesson7;

import java.util.Scanner;

public class MainStart {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int action;
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Марс", 6, 20);
        cats[1] = new Cat("Томас", 8, 20);
        cats[2] = new Cat("Рыжик", 12, 20);

        PlateTwo plateTwo = new PlateTwo(50);
        plateTwo.info();
        for (int i = 0; i < cats.length; i++) {
            if (cats[i].satiety <= 20 && cats[i].satiety < plateTwo.food){
                cats[i].eat(plateTwo);
                cats[i].satiety = 20;
                System.out.println("Котик " + cats[i].name + " покушал!");
            } else {
                System.out.println("Котик " + cats[i].name + " не поел!!!");
            }

        }
        plateTwo.info();
        System.out.println("Сколько грамм добавить в миску? Введите значение: ");
        action = sc.nextInt();
        plateTwo.increaseFood(action);
        plateTwo.info();
    }
}
