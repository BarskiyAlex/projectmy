package lesson8;

public class Cat extends Party implements Run {
    public Cat(String name, int maxRun, int maxJump) {
        super(name, maxRun, maxJump);
    }

    @Override
    public void runTreadMill(TreadMill treadMill) {
        if (treadMill.getSize() <= getMaxRun()) {
            System.out.println("Котикс " + getName() + ". Пробежал " + treadMill.getSize() + " метров.");
        } else {
            System.out.println("Котикс " + getName() + ". К сожалению, не смог пробежать " + treadMill.getSize() + " метров.");
        }
    }

    @Override
    public void jumpWall(Wall wall) {
        if (wall.getHeight() <= getMaxJump()){
            System.out.println("Котишка " + getName() + ". Смог перепрыгнуть стену высотой " + wall.getHeight() + " метров");
        } else {
            System.out.println("Котик " + getName() + ". Не смог перепрыгнуть стену высотой " + wall.getHeight() + " метров. И он очень грустит 😢");
        }
    }

    @Override
    public void run() {

    }
}
