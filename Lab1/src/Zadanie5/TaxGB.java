package Zadanie5;

public class TaxGB implements Tax{

    @Override
    public double calculate(double price) {
        return price * 0.2;
    }
}
