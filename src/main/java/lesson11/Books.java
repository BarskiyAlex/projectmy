package lesson11;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Books {

    private Map<Integer, String> books;

    void books() {
        books = new HashMap<>();
    }

    public void add(int number, String name) {
        books.put(number, name);
    }

    public void get(String name) {
        if (books.containsValue(name)) {
            Set<Map.Entry<Integer, String>> set = books.entrySet();
            for (Map.Entry<Integer, String> temp : set) {
                if (temp.getValue().equals(name)) {
                    System.out.println(temp.getValue() + " : " + temp.getKey());
                }
            }
        } else {
            System.out.println("Такого имени нет в списке");
        }
    }
}
