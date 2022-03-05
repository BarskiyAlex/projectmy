package lesson6.HomeWork6;

public abstract class Animal {
    private String whois;
    private String name;
    private int maxRun;
    private int maxSwim;
    private int run;
    private int swim;

    public Animal(String whois, String name, int maxRun, int maxSwim, int run, int swim) {
        this.whois = whois;
        this.name = name;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
        this.run = run;
        this.swim = swim;
    }

    public String getWhois() {
        return whois;
    }

    public void setWhois(String whois) {
        this.whois = whois;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxRun() {
        return maxRun;
    }

    public void setMaxRun(int maxRun) {
        this.maxRun = maxRun;
    }

    public int getMaxSwim() {
        return maxSwim;
    }

    public void setMaxSwim(int maxSwim) {
        this.maxSwim = maxSwim;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public int getSwim() {
        return swim;
    }

    public void setSwim(int swim) {
        this.swim = swim;
    }

    @Override
    public String toString() {
        return String.format("%s %s Может пробежать: %d метров. " + "Может проплыть: %d метров. ", whois, name, maxRun, maxSwim);
    }

    public abstract void move ();
}