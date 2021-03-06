package lesson11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public class Operations {
    public static List<String> fillTheArray(List<String> array) {
        array.add("привет");
        array.add("Привет");
        array.add("Машина");
        array.add("Парень");
        array.add("Мир");
        array.add("мир");
        array.add("Прив");
        array.add("Пока");
        array.add("Пока");
        array.add("пока");
        array.add("Пока");
        return array;
    }

    public static List<String> fillTheArrayFromFile(List<String> array, String fileName) throws IOException {
        StringBuffer buffer = new StringBuffer();
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        while (reader.ready()) {
            buffer.append(reader.readLine()).append("\n");
        }
        if (buffer.length() > 0) {
            String[] tempArr = buffer.toString().split(" ");
            for (String temp : tempArr) {
                array.add(temp);
            }
        }
        return array;
    }


    public static void printUniqueWords(List<String> array) {
        Set<String> tempArray = new LinkedHashSet<>();
        for (String arr : array) {
            String a = arr.toLowerCase();
            tempArray.add(a);
        }
        for (String tempArr : tempArray) {
            int count = 0;
            for (String arr : array) {
                String a = arr.toLowerCase();
                if (tempArr.equals(a)) count++;
            }
            System.out.println("\"" + tempArr + "\"" + " повторяется в списке -> " + count + " раз.");
        }
        System.out.println();
    }
}
