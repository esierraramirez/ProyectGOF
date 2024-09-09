
package Adapter;

public class Adapter implements Target {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        // Llama al método específico de Adaptee pero lo adapta a la interfaz Target
        adaptee.specificRequest();
    }
}

