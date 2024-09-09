
package FactoryMethod;

// Concrete Product
class Ship implements Transport {
    public void deliver() {
        System.out.println("Delivering by Ship");
    }
}
