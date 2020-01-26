package strategy_pattern.demo1;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I am flying!");
    }
}
