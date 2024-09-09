
package Observer;

public class ConcreteObserver2 extends Observer {
    public ConcreteObserver2(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("ConcreteObserver2: State of subject changed to: " + subject.getState());
    }
}