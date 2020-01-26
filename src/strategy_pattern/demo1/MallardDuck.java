package strategy_pattern.demo1;

public class MallardDuck extends Duck{
    public MallardDuck() {
        quackBehavior = new Quck();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I am real Mallard Duck");
    }
}
