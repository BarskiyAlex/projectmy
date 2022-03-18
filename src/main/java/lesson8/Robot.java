package lesson8;

public class Robot extends Party{
    public Robot(String name, int maxRun, int maxJump) {
        super(name, maxRun, maxJump);
    }

    @Override
    public void runTreadMill(TreadMill treadMill) {
        if (treadMill.getSize() <= getMaxRun()) {
            System.out.println("Мститель " + getName() + ". Пробежал " + treadMill.getSize() + " метров.");
        } else {
            System.out.println("Железяка " + getName() + ". К сожалению, не смог пробежать " + treadMill.getSize() + " метров.");
        }
    }

    @Override
    public void jumpWall(Wall wall) {
        if (wall.getHeight() <= getMaxJump()){
            System.out.println("Мститель " + getName() + ". Смог перепрыгнуть стену высотой " + wall.getHeight() + " метров, но он забыл, что умеет летать");
        } else {
            System.out.println("Железяка " + getName() + ". Не смог перепрыгнуть стену высотой " + wall.getHeight() + "  метров, потому что умеет летать");
        }
    }
}
