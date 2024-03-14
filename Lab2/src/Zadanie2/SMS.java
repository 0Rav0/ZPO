package Zadanie2;

public class SMS implements SendMethod{
    @Override
    public void send(Receiver receiver) {
        System.out.println("Sending SMS to " + receiver.getPhone());
    }
}
