package lesson6.HomeWork6;

public class Cat extends Animal {

    public Cat(String name, int maxRun, int maxSwim, int run, int swim) {
        super("Котик", name, maxRun, maxSwim, run, swim);
    }


    @Override
    public void move() {
        System.out.println("Кошка плавать не умеет");
        System.out.println(String.format("Кошка пробежала %d метра",getRun()));
    }
}

