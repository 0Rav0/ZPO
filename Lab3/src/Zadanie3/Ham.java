package Zadanie3;

public class Ham extends IngredientDecorator {
    public Ham(Pizza pizza) {
        super(pizza);
        description = ", Szynka";
        cost = .45;
    }

    public String getDescription() {
        return pizza.getDescription() + description;
    }

    public double cost() {
        return cost + pizza.cost();
    }

}
