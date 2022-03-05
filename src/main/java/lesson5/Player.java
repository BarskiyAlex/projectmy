package lesson5;

import java.util.Locale;

public class Player {
    String nickname;
    int points;
    int level;
    int money;

    public Player(String nickname, int level, int points, int money) {
        this.nickname = nickname.toUpperCase();
        this.points = points;
        this.level = level;
        this.money = Math.abs(money);
    }



    //    public Player(String nickname) {
//        this.nickname = nickname;
    public Player(String nickname) {
        this(nickname, 0, 1, 1000);
    }


    public void printInfo() {
        System.out.println(this.toString());
    }


    @Override
    public String toString() {
        return String.format("У игрока %s (%d лвл) %d монет и %d очков", nickname, level, money, points);
    }
}
