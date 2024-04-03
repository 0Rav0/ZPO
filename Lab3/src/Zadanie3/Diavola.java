package Zadanie3;

public class Diavola extends Pizza {
    public Diavola() {
        description = "Diavola";
    }

    public double cost() {
        return 16.99;
    }

    @Override
    public void omittingIngredient(Class<? extends IngredientDecorator> ingredient) {
    }
}
