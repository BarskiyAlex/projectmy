package lesson4.v2;

import java.util.Random;
import java.util.Scanner;

public class HomeWork4Version2 {

    private static final int SIZE = 3;

    private static final char DOT_EMPTY = '•';
    private static final char DOT_X_SYMBOL = 'X';
    private static final char DOT_O_SYMBOL = 'O';

    public static final String SPACE_MAP = " ";
    private static final String HEADER_FIRST_SYMBOL = "❣";

    private static char[][] MAP;
    private static final Scanner in = new Scanner(System.in);
    private static final Random random = new Random();

    private static int turnsCount;

    public static void turnGame() {
        do {
            System.out.println("\nStart Game!");
            init();
//            initMap();
            printMap();
            playGame();
        } while (isContinueGame());
        endGame();


    }


    private static void init() {
        turnsCount = 0;
//        SIZE = arr[][]
        MAP = new char[SIZE][SIZE];

        initMap();
    }


    private static void initMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                MAP[i][j] = DOT_EMPTY;
            }
        }
    }

    private static void printMap() {
        printMapHead();
        printMapBody();
    }

    private static void printMapHead() {
        System.out.print(HEADER_FIRST_SYMBOL + SPACE_MAP);
        for (int i = 0; i < SIZE; i++) {
            printMapNumber(i);
        }
        System.out.println();
    }

    private static void printMapNumber(int i) {
        System.out.print(i + 1 + SPACE_MAP);
    }

    private static void printMapBody() {
        for (int i = 0; i < SIZE; i++) {
            printMapNumber(i);
            for (int j = 0; j < SIZE; j++) {
                System.out.print(MAP[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void playGame() {
        while (true) {
            humanTurn();
            printMap();
            if (checkEnd(DOT_X_SYMBOL)) {
                break;
            }
            iaTurn();
            printMap();
            if (checkEnd(DOT_O_SYMBOL)) {
                break;
            }
        }
    }


    private static void humanTurn() {
        System.out.println("ХОД ЧЕЛОВЕКА");

        int rowNumber;
        int columnNumber;

        while (true) {
            rowNumber = getValidNumberFromUser() - 1;
            columnNumber = getValidNumberFromUser() - 1;

            if (isCellFree(rowNumber, columnNumber)) {
                break;
            }
        }

        MAP[rowNumber][columnNumber] = DOT_X_SYMBOL;
        turnsCount++;
    }

    private static int getValidNumberFromUser() {
        while (true) {
            System.out.print("Введите координату(1-" + SIZE + "): ");
            if (in.hasNextInt()) {
                int n = in.nextInt();
                if (isNumberValid(n)) {
                    return n;
                }
                System.out.println("\nПроверьте значение координаты. Значение должно быть в пределах от 1 до " + SIZE);
            } else {
                in.next();
                System.out.println("\nВвод допускате лишь целые числа");
            }
        }
    }

    private static boolean isNumberValid(int n) {
        return n >= 1 && n <= SIZE;
    }

    private static boolean isCellFree(int rowNumber, int columnNumber) {
        return MAP[rowNumber][columnNumber] == DOT_EMPTY;
    }

    private static void iaTurn() {
        System.out.println("ХОД КОМПЬЮТЕРА");

        int rowNumber;
        int columnNumber;

        do {
            rowNumber = random.nextInt(SIZE);
            columnNumber = random.nextInt(SIZE);
        }
        while (!isCellFree(rowNumber, columnNumber));

//      if(isCellFree(rowNumber, columnNumber)){
//        break; }

        MAP[rowNumber][columnNumber] = DOT_O_SYMBOL;
        turnsCount++;
    }

    private static boolean checkEnd(char symbol) {
        if (checkWin(symbol)) {
            if (symbol == DOT_X_SYMBOL) {
                System.out.println("\nПобеда! Поздравляю!");
            } else {
                System.out.println("\nПроигрыш! Попробуй еще раз!");
            }
            return true;
        }
        if (checkDraw()) {
            System.out.println("Ничья!");
            return true;
        }
        return false;
    }

    private static boolean checkDraw() {
        for (char[] chars : MAP) {
            for (char symbol : chars) {
                if (symbol == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;

//        return turnsCount >= SIZE * SIZE;
    }

    private static boolean checkWin(char symbol) {

        if (MAP[0][0] == symbol && MAP[0][1] == symbol && MAP[0][2] == symbol) return true;
        if (MAP[1][0] == symbol && MAP[1][1] == symbol && MAP[1][2] == symbol) return true;
        if (MAP[2][0] == symbol && MAP[2][1] == symbol && MAP[2][2] == symbol) return true;
        if (MAP[0][0] == symbol && MAP[1][0] == symbol && MAP[2][0] == symbol) return true;
        if (MAP[0][1] == symbol && MAP[1][1] == symbol && MAP[2][1] == symbol) return true;
        if (MAP[0][2] == symbol && MAP[1][2] == symbol && MAP[2][2] == symbol) return true;
        if (MAP[0][0] == symbol && MAP[1][1] == symbol && MAP[2][2] == symbol) return true;
        if (MAP[2][0] == symbol && MAP[1][1] == symbol && MAP[0][2] == symbol) return true;
        return false;
    }

    private static void endGame() {
        in.close();
        System.out.println("\nВозвращайтесь снова!");
    }

    private static boolean isContinueGame() {
        System.out.println("\nХотите продолжить игру? yes\\no");
        return switch (in.next()) {
            case "y", "yes", "+", "да", "конечно" -> true;
            default -> false;
        };
    }
}


