package lesson10;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String[] arr = {"asd", "bts", "dj", "123"};
        System.out.println("Task 1\n");
        swapElemets(arr, 2, 3);
        System.out.println(Arrays.toString(arr));

        List<String> list = convertToList(arr);
        System.out.println("Task 2\n" + list.getClass() + ":" + list);

        System.out.println("Task 3");
        Orange orange = new Orange();
        Apple apple = new Apple();
        Box<Orange> orangeBox1 = new Box();
        Box<Orange> orangeBox2 = new Box();
        Box<Apple> appleBox = new Box();
        orangeBox1.add(new Orange());
        orangeBox1.add(new Orange());
        orangeBox1.add(new Orange());

        for (int i = 0; i < 4; i++) {
            orangeBox2.add(new Orange());
        }

        for (int i = 0; i < 6; i++) {
            appleBox.add(new Apple());
        }

        orangeBox1.info();
        orangeBox2.info();
        appleBox.info();

        Float orange1Weight = orangeBox1.getWeight();
        Float orange2Weight = orangeBox2.getWeight();
        Float appleWeight = appleBox.getWeight();
        System.out.println("Вес коробки первой с апельсинами: " + orange1Weight + " килограмм.");
        System.out.println("Вес коробки второй с апельсинами: " + orange2Weight + " килограмм.");
        System.out.println("Вес коробки второй с яблоками: " + appleWeight + " килограмм.");


        System.out.println("Сравнить вес первой коробки с апельсинами и коробки с яблоками:" + orangeBox1.compare(appleBox));
        System.out.println("Сравнить вес второй коробки с апельсинами и коробки с яблоками:" + orangeBox2.compare(appleBox));

        orangeBox1.moveAt(orangeBox2);

        orangeBox1.info();
        orangeBox2.info();
        appleBox.info();
    }



    private static <E> List<E> convertToList(E[] array) {
        return Arrays.asList(array);
    }

    private static <T> void swapElemets(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
