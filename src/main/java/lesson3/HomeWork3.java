package lesson3;

import java.util.Arrays;

public class HomeWork3 {

    static final int DATA_SIZE = 100;
    static final int SIZE = 8;


    public static void main(String[] args) {
        System.out.println("🤔Задание №1");
        datatest();
        System.out.println("🤔Задание №2");
        datasize();
        System.out.println("🤔Задание №3");
        datacheck();
        System.out.println("🤔Задание №4");
        twoBlock();
        System.out.println("🤔Задание №5");
        whyIsItSoDifficult();
        System.out.println("🤔Задание №6");
        maxMin();
        System.out.println("🤔Задание №7");
        trueOrFalse();
        System.out.println("🤔Задание №8");
        moveResult();

    }

    //    #1
    private static void datatest() {
//        int[] data = new int [10];
        int[] data = {1, 0, 1, 0, 1, 0, 1, 0, 1, 0};
        for (int i = 0; i < data.length; i++) {
            if (data[i] == 1) {
                data[i] = 0;
            } else {
                data[i] = 1;
            }
        }
        System.out.println(Arrays.toString(data));
    }

    //    #2
    private static void datasize() {
        int[] data = new int[DATA_SIZE];
        for (int j = 0; j < data.length; j++) {
            data[j] = j + 1;
        }
        System.out.print(Arrays.toString(data));
    }

    //    #3
    private static void datacheck() {
        int[] datacheck = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < datacheck.length; i++) {
            int result = datacheck[i];
            if (result < 6) {
                datacheck[i] = result * 2;
            }
        }
        System.out.println(Arrays.toString(datacheck));
    }

    //    #4
    private static void twoBlock() {
        int[][] arr = new int[SIZE][SIZE];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0, x = arr[i].length - 1; j < arr[i].length; j++) {
                if (i == j) arr[i][i] = 1;
                else arr[i][i] = 0;
                System.out.print(arr[i][i] + " ");
            }
            System.out.print("\n");
        }
    }

    //    #5
    private static void whyIsItSoDifficult() {
        int[] newHard = getNewHard(4, 20);
        System.out.println(Arrays.toString(newHard));
    }

    private static int[] getNewHard(int len, int initialValue) {
        int[] cry = new int[len];
        Arrays.fill(cry, initialValue);
        return cry;
    }

    //    #6
    private static void maxMin() {
        int[] array = {3, 4, 5, 6, 1, 20, 9};
        int max = array[0];
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            } else if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
    }

    //    #7


    private static void trueOrFalse() {
        System.out.println(checkSum(new int[]{2, 2, 2, 1, 2, 2, 0, 0, 10, 1}));
        System.out.println(checkSum(new int[]{2, 2, 2, 1, 2}));
        System.out.println(checkSum(new int[]{6, 6, 4, 8, 8}));

    }

    private static int sum(int[] array, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += array[i];
        }
        return sum;
    }

    private static boolean checkSum(int[] array) {
        int leftSum = 0;
        int rightSum = sum(array, 0, array.length);
        if (rightSum % 2 != 0) {
            return false;
        }
        for (int i = 0; i < array.length; i++) {

            leftSum += array[i];
            rightSum -= array[i];

            if (leftSum == rightSum) {
                return true;
            }

        }
        return false;
    }

//    #8
    private static void moveResult(){
        shiftBlock(new int[]{1, 2, 3, 4, 5}, 0);
        shiftBlock(new int[]{1, 2, 3, 4, 5}, 2);
        shiftBlock(new int[]{1, 2, 3, 4, 5}, 3);
    }

    private static void shiftBlock(int[] array, int n){
        int shiftNumber = n % array.length;
        if (shiftNumber < 0) {
            shiftLeft(array,shiftNumber);
        }  else {
            shiftRight(array, shiftNumber);
        }
        System.out.println(Arrays.toString(array) + "; shiftNumber = " + n);
    }

    private static void shiftRight(int[] array, int n) {
        for (int i = 0; i < Math.abs(n); i++) {
            int firstValue = array[0];
            for (int j = 0; j < array.length - 1; j++) {
                array[i] = array[j + 1];
            }
            array[array.length - 1] = firstValue;
        }
    }

    private static void shiftLeft(int[] array, int n) {
        for (int i = 0; i < n; i++) {
            int lastValue = array[array.length - 1];
            for (int j = 0; j < array.length - 1; j--) {
                array[i] = array[j - 1];
            }
            array[0] = lastValue;
        }
    }




}



