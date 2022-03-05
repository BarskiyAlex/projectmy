package lesson6.HomeWork6;

public class MainAnimal {
    public static void main(String[] args) {




        Cat cat = new Cat("Thomas", 200, 0, 110, 0);
        Dog dog = new Dog("Lord", 500, 10, 150, 2);

        System.out.println(cat.toString());
        cat.move();
        System.out.println("----------------------------\n");
        System.out.println(dog.toString());
        dog.move();
        System.out.println("----------------------------\n");
    }
}
