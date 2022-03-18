package lesson8;

public class Main {
    public static void main(String[] args) {

        int stage = 0;

        Party[] party = new Party[3];
        party[0] = new Cat("Марс", 300, 6);
        party[1] = new Human("Капитан Америка", 3000, 5);
        party[2] = new Robot("Джарвис", 30000, 15);


        TreadMill treadMill = new TreadMill(300);
        Wall wall = new Wall(2);


        goMarathon(party, treadMill, wall);
    }

    public static void goMarathon(Party[] party, TreadMill treadMill, Wall wall) {
        int stage;
        do {
            for (stage = 1; stage <= 3; stage++) {
                treadMill.setSize(treadMill.getSize() * stage);
                wall.setHeight(stage * wall.getHeight());
            }
            for (int i = 0; i < 3; i++) {
                if (party[i].getMaxRun() < treadMill.getSize()) {
                    continue;
                }
                party[i].runTreadMill(treadMill);
            }
            for (int j = 0; j < 3; j++) {
                if (party[j].getMaxJump() < wall.getHeight()) {
                    continue;
                }
                party[j].jumpWall(wall);
            }
            System.out.println("\n"+ stage + "этап окончен" + "\n");
        } while (stage == 3);
    }
}

