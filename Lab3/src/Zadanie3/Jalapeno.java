package Zadanie3;

public class Jalapeno extends IngredientDecorator {
    Pizza pizza;

    public Jalapeno(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription() {
        return pizza.getDescription() + ", Jalapeno";
    }

    public double cost() {
        return 1.99 + pizza.cost();
    }
}
