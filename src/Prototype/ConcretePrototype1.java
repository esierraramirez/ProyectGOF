
package Prototype;

public class ConcretePrototype1 implements Prototype {
    private String name;

    public ConcretePrototype1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype1(this.name);
    }

    @Override
    public String toString() {
        return "ConcretePrototype1{name='" + name + "'}";
    }
}