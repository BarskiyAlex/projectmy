package lesson7;

public class MainStart {
    public static void main(String[] args) throws InterruptedException {
        Cats cat = new Cats("Томас");
        Plate plate = new Plate(10);

        plate.printInfo();

//        while (plate.getFoodCount() > 0){
//            cat.eat(plate);
//            plate.printInfo();
//            Thread.sleep(3000);
//        }

//        cat.eat(plate);
//        plate.printInfo();

    }
}
