
package Adapter;

public class Main {
    public static void main(String[] args) {
        // El cliente espera una interfaz Target
        Adaptee adaptee = new Adaptee();
        Target adapter = new Adapter(adaptee);

        // El cliente usa el Adapter como si fuera un Target
        Client client = new Client(adapter);
        client.makeRequest();
    }
}
