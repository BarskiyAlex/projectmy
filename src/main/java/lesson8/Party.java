package lesson8;

public abstract class Party {
    private String name;
    private int maxRun;
    private int maxJump;

    public Party(String name, int maxRun, int maxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    public String getName() {
        return name;
    }

    public int getMaxRun() {
        return maxRun;
    }

    public int getMaxJump() {
        return maxJump;
    }

    public abstract void runTreadMill(TreadMill treadMill);

    public abstract void jumpWall(Wall wall);
}
