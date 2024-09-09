
package Prototype;

public class Main {
    public static void main(String[] args) {
        // Crear prototipos
        ConcretePrototype1 prototype1 = new ConcretePrototype1("Prototype 1");
        ConcretePrototype2 prototype2 = new ConcretePrototype2(100);

        // Añadir prototipos a la fábrica
        PrototypeFactory.addPrototype("proto1", prototype1);
        PrototypeFactory.addPrototype("proto2", prototype2);

        // Clonar los prototipos
        Prototype clonedPrototype1 = PrototypeFactory.getPrototype("proto1");
        Prototype clonedPrototype2 = PrototypeFactory.getPrototype("proto2");

        // Mostrar los objetos clonados
        System.out.println(clonedPrototype1);
        System.out.println(clonedPrototype2);
    }
}