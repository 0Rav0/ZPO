public class Main {
    public static void main(String[] args) {
        DeliveryFactory deliveryFactory = new DeliveryFactory();
        Store store = new Store(deliveryFactory);

        store.deliverOrder("Inpost");
        store.deliverOrder("DPD");
    }
}