public class Store {
    private DeliveryFactory deliveryFactory;

    public Store(DeliveryFactory deliveryFactory) {
        this.deliveryFactory = deliveryFactory;
    }

    public void deliverOrder(String deliveryType) {
        Delivery delivery = deliveryFactory.createDelivery(deliveryType);
        delivery.deliver();
    }
}
