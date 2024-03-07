package Zadanie5;

public class OnlineStore {
    Tax tax;
    public OnlineStore(Tax tax) {
        this.tax = tax;
    }

    public double calculateTax(double price){
        return this.tax.calculate(price);
    }

    public void setTax(Tax tax) {
        this.tax = tax;
    }
}
