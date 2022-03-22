package lesson7;

public class Cat {
    public String name;
    public int hungry;
    public int satiety;

    public Cat(String name, int hungry, int satiety) {
        this.name = name;
        this.hungry = hungry;
        this.satiety = 20;
    }

    public void eat(PlateTwo p) {
        p.decreaseFood(satiety);
    }
}
