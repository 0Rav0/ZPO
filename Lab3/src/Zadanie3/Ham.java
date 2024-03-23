package Zadanie3;

public class Ham extends IngredientDecorator {
    Pizza pizza;

    public Ham(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription() {
        return pizza.getDescription() + ", Szynka";
    }

    public double cost() {
        return .45 + pizza.cost();
    }
}
