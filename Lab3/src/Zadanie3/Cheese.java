package Zadanie3;

public class Cheese extends IngredientDecorator {
    Pizza pizza;

    public Cheese(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription() {
        return pizza.getDescription() + ", Ser";
    }

    public double cost() {
        return .99 + pizza.cost();
    }
}
