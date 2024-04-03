package Zadanie3;

public abstract class IngredientDecorator extends Pizza{
    Pizza pizza;

    public IngredientDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    public void omittingIngredient(Class<? extends IngredientDecorator> ingredient) {
        if (this.getClass().equals(ingredient)){
            description = "";
            cost = 0;
        }
        else
            pizza.omittingIngredient(ingredient);
    }
}
