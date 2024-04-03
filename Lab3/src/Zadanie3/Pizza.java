package Zadanie3;

public abstract class Pizza {
    String description = "Nieznana pizza";
    double cost = 0;

    public String getDescription() {
        return description;
    }

    public double cost(){
        return cost;
    }

    public abstract void omittingIngredient(Class<? extends IngredientDecorator> ingredient);
}
