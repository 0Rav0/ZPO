package Zadanie3;

public abstract class Pizza {
    String description = "Nieznana pizza";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
