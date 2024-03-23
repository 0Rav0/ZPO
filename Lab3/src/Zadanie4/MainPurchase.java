package Zadanie4;

public class MainPurchase {
    public static void main(String[] args) {
        Product p1 = new Locker();

        p1 = new Mascot(p1);
        p1 = new Transport(p1);

        System.out.println(p1.getDescription()+ " $"+ p1.cost());
    }
}

