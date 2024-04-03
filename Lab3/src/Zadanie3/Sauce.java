package Zadanie3;

public class Sauce extends IngredientDecorator {
    public Sauce(Pizza pizza) {
        super(pizza);
        description = ", Sos";
        cost = 1.11;
    }

    public String getDescription() {
        return pizza.getDescription() + description;
    }

    public double cost() {
        return cost + pizza.cost();
    }

}
