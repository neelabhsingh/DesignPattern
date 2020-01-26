package strategy_pattern.demo1;

public class Quck implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
