package lesson9;

public class Main {
    public static void main(String[] args) {
        String[][] arr = new String[][]{{"1", "2", "3", "4"}, {"2", "2", "2", "3"}, {"1", "2", "2", "2"}, {"2", "2", "2", "2"}};
        try {
            try {
                int result = method(arr);
                System.out.println(result);
            } catch (MySizeArrayException e) {
                System.out.println("Размер массива повышен");
            }
        } catch (MyArrayDataException e) {
            System.out.println("Неправильное значение массива!");
            System.out.println("Ошибка в ячейке: " + e.i + "x" + e.j);
        }
    }

    private static int method(String[][] arr) throws MySizeArrayException, MyArrayDataException {
        int count = 0;
        if (arr.length != 4) {
            throw new MySizeArrayException();
        }
        for (String[] strings : arr) {
            if (strings.length != 4) {
                throw new MySizeArrayException();
            }
        }
        int i = 0;
        for (int j = 0; j < arr[i].length; j++) {
            try {
                count = count + Integer.parseInt(arr[i][j]);
            } catch (NumberFormatException e) {
                throw new MyArrayDataException(i, j);
            }
        }


        return count;
    }
}
