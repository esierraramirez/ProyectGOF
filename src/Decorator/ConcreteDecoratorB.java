
package Decorator;

public class ConcreteDecoratorB extends Decorator {

    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();  // Mantiene el comportamiento del componente original
        System.out.println("Adding functionality in ConcreteDecoratorB.");
    }
}
