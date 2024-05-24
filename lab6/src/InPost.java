public class InPost implements Delivery{
    @Override
    public void deliver() {
        System.out.println("Dostarczenie do poczkomatu za pomocą InPost");
    }
}
