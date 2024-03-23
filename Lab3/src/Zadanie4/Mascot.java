package Zadanie4;

public class Mascot extends ProductDecorator {
    Product product;

    public Mascot(Product product) {
        this.product = product;
    }

    public String getDescription() {
        return product.getDescription() + ", Maskotka";
    }

    public double cost() {
        return product.cost();
    }
}
