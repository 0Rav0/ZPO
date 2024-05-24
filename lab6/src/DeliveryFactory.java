public class DeliveryFactory {
    public Delivery createDelivery(String type){
        type = type.toLowerCase();
        return switch (type) {
            case "standard" -> new StandardPost();
            case "dhl" -> new DHL();
            case "dpd" -> new DPD();
            case "inpost" -> new InPost();
            default -> throw new IllegalArgumentException("Nieznany sposób dostawy");
        };
    }
}
