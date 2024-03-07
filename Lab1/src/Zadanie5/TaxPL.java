package Zadanie5;

public class TaxPL implements Tax {
    @Override
    public double calculate(double price) {
        return price * 0.23;
    }
}
