public class StandardPost implements Delivery{
    @Override
    public void deliver() {
        System.out.println("Dostarczenie za pomocą poczty");
    }
}
