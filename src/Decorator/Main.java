
package Decorator;

public class Main {
    public static void main(String[] args) {
        // Componente simple
        Component component = new ConcreteComponent();

        // Decorador A
        Component decoratorA = new ConcreteDecoratorA(component);
        
        // Decorador B sobre A
        Component decoratorB = new ConcreteDecoratorB(decoratorA);

        // Ejecutar
        decoratorB.operation();
    }
}
