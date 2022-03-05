package lesson2;

public class HomeWork2 {
    public static void main(String[] args) {
        System.out.println("1 + 19 => " + checkSumSign(1, 19));
        System.out.println("6 + 15 => " + checkSumSign(6, 15));
        NumberPositiveOrNegative(10);
        NumberPositiveOrNegative(-2);
        System.out.println("//Number 1:  => " + NumberTrueOrFalse(40));
        System.out.println("//Number 2:  => " + NumberTrueOrFalse(-40));
        TestCommandFor("😺🐈  ", 5);

       HowYear(1);
       HowYear(300);
       HowYear(200);
       HowYear(400);
       HowYear(500);
       HowYear(1400);
       HowYear(1600);
       HowYear(2022);

    }

    //#1. checkSumSign
    private static boolean checkSumSign(int a, int b) {
        int result = a + b;
        System.out.print("Сумма:" + result + "; ");
        if (result >= 10 && result <= 20) {
            return true;
        }
        else {
            return false;
        }
    }

    //#2. NumberPositiveOrNegative
    private static void NumberPositiveOrNegative(int n) {
        String strPattern = "Number: " + n + " ";
        if (n >= 0) {
            strPattern += "positive";
        }
        else if (n < 0) {
            strPattern += "negative";
        }
        System.out.println(strPattern);
    }

    //#3. NumberTrueOrFalse
    private static boolean NumberTrueOrFalse(int z) {
        return (z >= 0);
    }
    //    #4.   TestCommandFor
    private static void TestCommandFor(String str, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(str);
        }
    }

    //    #5. Year
    static void HowYear(int year) {
        boolean isLeap = Year(year);
        if (Year(year)) {
            System.out.print(year + " is leap year\n");
        }
        else {
            System.out.print(year + " is not leap year\n");
        }
    }

    private static boolean Year(int year){
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);

    }
}

