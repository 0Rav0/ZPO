package Zadanie3;

public class Capriciosa extends Pizza {
    public Capriciosa() {
        description = "Capriciosa";
    }

    public double cost() {
        return 15.99;
    }

    @Override
    public void omittingIngredient(Class<? extends IngredientDecorator> ingredient) {

    }
}
