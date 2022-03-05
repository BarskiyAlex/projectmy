package lesson5.HpmeWork5;

import java.util.Arrays;

public class MainHome {
    public static void main(String[] args) {



        Personal personal1 = new Personal("Ivanov Ivan Ivanovich", "Engineer", "ivivan@mailbox.com", "23-22-22", 30000, 30);
        Personal personal2 = new Personal("Vlad Mir Vodoo", "Android-Delevoper", "bear@mailbox.com", "26-21-33", 50000, 47);
        Personal personal3 = new Personal("Max Super Star", "Administrator", "bigboss@mailbox.com", "40-50-60", 100000, 44);
        Personal personal4 = new Personal("Alexey Very Cute", "SMM-manager", "smm@mailbox.com", "13-37-42", 90000, 20);
        Personal personal5 = new Personal("Maximus Over Strong", "Phyton-Delevoper", "mouse@,ailbox.com", "12-34-56", 4000, 50);

//        Personal[] personals = new Personal[5];
        Personal[] personals = {personal1, personal2, personal3, personal4, personal5};
        for (Personal personal : personals) {
               if (personal.age > 40) {
                   personal.printInfo();
               }
        }

    }


}
