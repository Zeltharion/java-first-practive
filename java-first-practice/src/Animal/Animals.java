package Animal;

public abstract class Animals {

    int legs;
    public String name;
    public Animals(int legs, String name) {
        this.legs = legs;
        this.name = name;
    }

    public void sleep() {
        System.out.println("go to sleep");
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }
}
