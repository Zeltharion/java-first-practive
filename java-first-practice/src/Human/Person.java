package Human;

public interface Person {
    int NUM = 3; // const in interface
    void walk(int speed);
    default void goToWork() {
        System.out.println("Time to do job");
    }
    void goToHome();
}
