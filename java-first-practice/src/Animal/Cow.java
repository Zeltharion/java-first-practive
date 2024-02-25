package Animal;

public class Cow extends Animals{
    boolean fly;

    public Cow(int legs, String name, boolean fly) {
        super(legs,name);
        this.fly = fly;
    }

}
