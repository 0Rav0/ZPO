package Zadanie3;

public class Cheese extends IngredientDecorator {
    public Cheese(Pizza pizza) {
        super(pizza);
        description = ", Ser";
        cost = .99;
    }

    public String getDescription() {
        return pizza.getDescription() + description;
    }

    public double cost() {
        return cost + pizza.cost();
    }

}
