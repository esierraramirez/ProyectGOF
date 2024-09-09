
package Prototype;

public class ConcretePrototype2 implements Prototype {
    private int id;

    public ConcretePrototype2(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype2(this.id);
    }

    @Override
    public String toString() {
        return "ConcretePrototype2{id=" + id + "}";
    }
}