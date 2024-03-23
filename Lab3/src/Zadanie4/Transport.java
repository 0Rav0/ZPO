package Zadanie4;

public class Transport extends ProductDecorator {
    Product product;

    public Transport(Product product) {
        this.product = product;
    }

    public String getDescription() {
        return product.getDescription() + ", Transport";
    }

    public double cost() {
        return 13 + product.cost();
    }
}
