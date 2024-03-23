package Zadanie3;

public class Sauce extends IngredientDecorator {
    Pizza pizza;

    public Sauce(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription() {
        return pizza.getDescription() + ", Sos";
    }

    public double cost() {
        return 1.11 + pizza.cost();
    }
}
