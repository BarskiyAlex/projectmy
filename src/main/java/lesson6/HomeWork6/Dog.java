package lesson6.HomeWork6;

public class Dog extends Animal{

    public Dog(String name, int maxRun, int maxSwim, int run, int swim) {
        super("Пёсель", name, maxRun, maxSwim, run, swim);
    }

    @Override
    public void move() {
        System.out.println(String.format("Собака проплыла %d метра",getSwim()));
        System.out.println(String.format("Собака пробежала %d метра",getRun()));
    }
}
