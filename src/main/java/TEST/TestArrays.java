package lesson3;

import java.util.Arrays;
import java.util.Collections;

public class TestArrays {

    static final int ARRAY_SIZE = 9;

    public static void main(String[] args) {
//        testOneArray();
        testTwoArray();
    }

    private static void testOneArray() {
        int[] data = new int[ARRAY_SIZE];
        int[] data2 = {1, 2, 3, 4, 5, 6};
        Arrays.fill(data, -1);

        data[0] = 3;
        data[3] = 6;
        data[4] = 7;
        data[data.length - 1] = 1;

/*        System.out.println(data[0]);
        System.out.println(data[1]);
        System.out.println(data[2]);
        System.out.println(data[3]);
        System.out.println(data[4]);
        System.out.println(data[5]);
        System.out.println(data[6]);
        System.out.println(data[7]);
        System.out.println(data[8]);*/

/*        String str = "[";
        for (int i = 0; i < data.length; i++) {
            str += data[i];
//            if (i < data.length - 1) {
            if (i != data.length - 1) {
                str += ", ";
            }
        }
        str += "]";
        System.out.println(str);*/

        Arrays.sort(data);

        System.out.println(Arrays.toString(data));

        String[] strArr = new String[10];
        System.out.println(Arrays.toString(strArr));

        Integer[] integers = new Integer[10];
        Arrays.fill(integers, -1);
        integers[1] = 1;
        integers[6] = 777;
        integers[7] = 0;
        integers[0] = 0;
        Arrays.sort(integers, Collections.reverseOrder());
        System.out.println(Arrays.toString(integers));
    }

    private static void testTwoArray() {
//        int[][] deepData = {{1, 2, 3}, {1, 2, 3, 4, 5}};
        int[][] deepData = new int[ARRAY_SIZE][ARRAY_SIZE];

/*        deepData[0][0] = 1;
        deepData[0][1] = 1;
        deepData[0][2] = 1;
        deepData[1][0] = 1;
        deepData[1][1] = 1;
        deepData[1][2] = 1;
        deepData[2][0] = 1;
        deepData[2][1] = 1;
        deepData[2][2] = 1;*/
        int n = 1;
        for (int i = 0; i < deepData.length; i++) {
            for (int j = 0; j < deepData[i].length; j++) {
                deepData[i][j] = n++;
            }
        }

/*        for (int i = 0; i < deepData.length; i++) {
            int[] datum = deepData[i];
            for (int j = 0; j < datum.length; j++) {
                int num = datum[j];
                System.out.print(num + " ");
            }
            System.out.println();
        }*/

        for(int[] datum : deepData) {
            for (int num : datum) {
                System.out.printf("%2d ", num);
            }
            System.out.println();
        }
    }
}
