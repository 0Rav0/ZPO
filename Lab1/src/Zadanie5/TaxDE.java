package Zadanie5;

public class TaxDE implements Tax {
    @Override
    public double calculate(double price) {
       return price * 0.14;
    }
}
