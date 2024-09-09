
package FactoryMethod;

// Client
public class FactoryMethodDemo {
    public static void main(String[] args) {
        Logistics logistics = new RoadLogistics();
        logistics.planDelivery();
        
        logistics = new SeaLogistics();
        logistics.planDelivery();
    }
}
