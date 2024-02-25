package Human;

// first extend, second implements as rule
public class Worker extends Person2 implements Person{

    @Override
    public void walk(int speed) {}

    @Override
    public void goToHome() {}

}