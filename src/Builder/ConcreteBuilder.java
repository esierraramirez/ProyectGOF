
package Builder;

public class ConcreteBuilder implements Builder {
    private Product product = new Product();

    @Override
    public void buildPartA() {
        product.setPartA("Part A built");
    }

    @Override
    public void buildPartB() {
        product.setPartB("Part B built");
    }

    @Override
    public void buildPartC() {
        product.setPartC("Part C built");
    }

    @Override
    public Product getResult() {
        return product;
    }
}

