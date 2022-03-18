package lesson8;

public class Human extends Party{
    public Human(String name, int maxRun, int maxJump) {
        super(name, maxRun, maxJump);
    }

    @Override
    public void runTreadMill(TreadMill treadMill) {
        if (treadMill.getSize() <= getMaxRun()) {
            System.out.println("Участник " + getName() + ". Пробежал" + treadMill.getSize() + " метров.");
        } else {
            System.out.println("Участник " + getName() + ". Не смог пробежать" + treadMill.getSize() + " метров.");
        }
    }

    @Override
    public void jumpWall(Wall wall) {
        if (wall.getHeight() <= getMaxJump()){
            System.out.println("Участник " + getName() + ". Смог перепрыгнуть стену высотой" + wall.getHeight() + " метров.");
        } else {
            System.out.println("Участник " + getName() + ". Не смог перепрыгнуть стену высотой" + wall.getHeight() + " метров.");
        }
    }
}
