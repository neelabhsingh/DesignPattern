package strategy_pattern.demo1;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< Silence>>");
    }
}
