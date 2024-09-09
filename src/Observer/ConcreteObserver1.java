
package Observer;

public class ConcreteObserver1 extends Observer {
    public ConcreteObserver1(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("ConcreteObserver1: State of subject changed to: " + subject.getState());
    }
}