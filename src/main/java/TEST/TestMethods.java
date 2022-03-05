package lesson3;

public class TestMethods {
    public static void main(String[] args) {
        multuply(3, 4);
        multuply(3.7, 4.3);
        multuply(7);
//        multuply(new int[]{1, 2, 3, 4, 5, 6, 7});
        multuply(1, 2, 3, 4, 5, 6, 7);
    }

    static void multuply(int a, int b) {
        int multiply = a * b;
        System.out.printf("Произведение %d и %d равно %d(целые)%n", a, b, multiply);
    }

    private static void multuply(double a, double b) {
        double multiply = a * b;
        System.out.printf("Произведение %.2f и %.2f равно %.2f(дробные)%n", a, b, multiply);
    }

    private static void multuply(int a) {
        int multiply = a * a;
        System.out.printf("Квадрат числа %d равен %d%n", a, multiply);
    }

//    private static arr[] multuply(int[] arr) {
    private static void multuply(int... a) {
        int multiply = 1;
        for (int num : a) {
            multiply *= num;
        }
        System.out.printf("Произведение всех чисел равно %d%n", multiply);
    }

}
