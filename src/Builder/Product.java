
package Builder;

public class Product {
    private String partA;
    private String partB;
    private String partC;

    // Setters for parts
    public void setPartA(String partA) {
        this.partA = partA;
    }

    public void setPartB(String partB) {
        this.partB = partB;
    }

    public void setPartC(String partC) {
        this.partC = partC;
    }

    @Override
    public String toString() {
        return "Product built with: " + partA + ", " + partB + ", " + partC;
    }
}


