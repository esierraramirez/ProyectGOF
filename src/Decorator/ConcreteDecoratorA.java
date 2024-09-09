
package Decorator;

public class ConcreteDecoratorA extends Decorator {

    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();  // Mantiene el comportamiento del componente original
        System.out.println("Adding functionality in ConcreteDecoratorA.");
    }
}
