package Zadanie4;

public class Lanyard extends ProductDecorator {
    Product product;

    public Lanyard(Product product) {
        this.product = product;
    }

    public String getDescription() {
        return product.getDescription() + ", Smycz do pendriva";
    }

    public double cost() {
        return 1 + product.cost();
    }
}
