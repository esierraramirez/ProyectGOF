
package FactoryMethod;

// Concrete Creator
class SeaLogistics extends Logistics {
    public Transport createTransport() {
        return new Ship();
    }
}
