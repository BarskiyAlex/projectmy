package lesson5;

public class MainWork {
    public static void main(String[] args) {

        Player player1 = new Player("Витя-АК47", 999, 10, 100);
        Player player2 = new Player("Димон");
        Player player3 = new Player("Vlados", 2, 9999, 8800);

//        player1.nickname = "Витя-АК47";
////        player2.nickname = "Димон";
//
//        player1.level = 10;
//        player2.level = 999;


//        System.out.println(player1.toString());
//        System.out.println(player2);

//        System.out.println("Игрок 1: " + player1.nickname + " " + player1.level);
//        System.out.println("Игрок 2: " + player2.nickname + " " + player2.level);

//        System.out.println(player1.toString());
//        System.out.println(player2.toString());
//
//        player1.printInfo();
//        player2.printInfo();
//        player3.printInfo();

//        System.out.println("Какая-то строка" + player1);

        Player[] players = {player1, player2, player3};
        for (Player player : players) {
            if (player.points > 400) {
                player.printInfo();
            } else {
                System.out.println(player.nickname + " Dont Up lelel");
            }
        }
    }
}
