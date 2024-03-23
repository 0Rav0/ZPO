package Zadanie4;

public abstract class Product {
    String description = "Nieznany produkt";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
