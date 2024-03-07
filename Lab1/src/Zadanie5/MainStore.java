package Zadanie5;

public class MainStore {
    public static void main(String[] args) {
        OnlineStore Store = new OnlineStore(new TaxPL());

        double price = 123.45;
        System.out.println("Price: " + price);
        System.out.println("Tax in Poland: " + Store.calculateTax(price));

        Store.setTax(new TaxDE());
        System.out.println("Tax in Germany: " + Store.calculateTax(price));

        Store.setTax(new TaxGB());
        System.out.println("Tax in UK: " + Store.calculateTax(price));
    }
}
