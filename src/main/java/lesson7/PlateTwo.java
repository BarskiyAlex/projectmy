package lesson7;

public class PlateTwo {

    public int food;

    public PlateTwo(int food) {
        this.food = food;
    }

    public void decreaseFood(int n) {
        food = food - n;
    }

    public void increaseFood(int x) {
        food += x;
    }

    public void info() {
        System.out.println("Всего еды: " + food);
    }
}
