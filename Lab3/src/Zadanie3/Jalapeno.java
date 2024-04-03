package Zadanie3;

public class Jalapeno extends IngredientDecorator {
    public Jalapeno(Pizza pizza) {
        super(pizza);
        description = ", Jalapeno";
        cost = 1.99;
    }

    public String getDescription() {
        return pizza.getDescription() + description;
    }

    public double cost() {
        return cost+ pizza.cost();
    }

}
