package Zadanie4;

public class Discount extends ProductDecorator {
    Product product;

    public Discount(Product product) {
        this.product = product;
    }

    public String getDescription() {
        return product.getDescription() + ", Rabat";
    }

    public double cost() {
        if (product.cost() >= 10)
            return product.cost() - 10;
        else
            return 0;
    }
}
