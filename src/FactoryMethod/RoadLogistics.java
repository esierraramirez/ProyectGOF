
package FactoryMethod;

// Concrete Creator
class RoadLogistics extends Logistics {
    public Transport createTransport() {
        return new Truck();
    }
}
