
package Builder;

public class Main {
    public static void main(String[] args) {
        // Create builder instance
        Builder builder = new ConcreteBuilder();

        // Director directs the construction process
        Director director = new Director(builder);

        // Construct the product
        Product product = director.construct();

        // Show the built product
        System.out.println(product);
    }
}

