package Zadanie3;

public class Margheritta extends Pizza {
    public Margheritta() {
        description = "Margheritta";
    }

    public double cost() {
        return 14.99;
    }

    @Override
    public void omittingIngredient(Class<? extends IngredientDecorator> ingredient) {
    }
}
