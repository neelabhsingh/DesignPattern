package observers_pattern.demo1;

import javax.xml.bind.annotation.adapters.HexBinaryAdapter;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();
        new BinaryObserver(subject);
        System.out.println("First state change : 15");
        subject.setState(15);
        System.out.println("Second state change : 10");
        subject.setState(10);
    }
}
