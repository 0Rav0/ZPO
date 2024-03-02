package Zadanie5;

public abstract class OnlineStore {
    Tax tax;

    public OnlineStore(Tax tax) {
        this.tax = tax;
    }

    public void calculateTax(){
        this.tax.calculate();
    }
}
