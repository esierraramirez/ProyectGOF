
package Observer;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();

        // Crear observadores
        new ConcreteObserver1(subject);
        new ConcreteObserver2(subject);

        System.out.println("Changing subject state to 10");
        subject.setState(10);

        System.out.println("Changing subject state to 20");
        subject.setState(20);
    }
}