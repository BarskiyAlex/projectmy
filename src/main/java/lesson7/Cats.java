package lesson7;

import java.util.concurrent.ThreadLocalRandom;

public class Cats {
    private String name;

    public Cats(String name) {
        this.name = name;
    }

    public void eat(Plate plate){
        plate.deacreaseFood(ThreadLocalRandom.current().nextInt(4) + 3);
    }

}